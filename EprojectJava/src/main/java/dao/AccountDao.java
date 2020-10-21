package dao;

import java.security.SecureRandom;
import java.sql.Date;

import java.sql.DriverManager;
import java.time.ZoneId;

import javax.swing.JOptionPane;

import org.mindrot.jbcrypt.BCrypt;

import common.ConnectDB;
import entity.Account;
import view.UpdateAccount;
//mail
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class AccountDao {
	public void insertAccount(Account acc) {
		try (
				var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
				var cs = connect.prepareCall("{call insAcc(?,?,?,?)}");
				
			)
		{
			cs.setString(1, acc.getFullname());
			
			cs.setString(2, acc.getAccount());
			cs.setString(3, acc.getEmail());
			cs.setString(4, acc.getPass());
			
			cs.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Integer selectAccount(Account acc, String username, String pass) {
		
		Integer getid = null;
		
		try (
				var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
				var cs = connect.prepareCall("{call selAcc(?)}")
			) 
		{
			cs.setString(1, username);
			var rs = cs.executeQuery();
			
			if(rs.next()) {
				String account = rs.getString("account");		
				boolean valuate = BCrypt.checkpw(pass,rs.getString("pass"));	
				getid = rs.getInt("id_acc");	
				if(username.equals(account) && valuate == true) {
					JOptionPane.showMessageDialog(null, "Logged in successfully");
					
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Wrong Password or UserName");
				}					
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return getid;
	}
	
	public void UpdateAccount(Account acc, String cbbGender,int getId) {
		try (
				var connect = DriverManager.getConnection(ConnectDB.getConnectionUrl());
				var cs = connect.prepareCall("{call UpInfoAcc(?,?,?,?,?,?,?)}")
			)
		{
			
			cs.setString(1, acc.getFullname());
			cs.setDate(2,Date.valueOf( acc.getDob()));
			cs.setString(3, cbbGender);
			cs.setInt(4, acc.getPhone());
			cs.setString(5,acc.getEmail());
			cs.setString(6, acc.getAddr());
			cs.setInt(7, getId);
			cs.executeUpdate();
			JOptionPane.showMessageDialog(null, "Update Success");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public Integer SendCode(String email) {
	  	//random code
    	Integer random_int = null;
        int min = 10000;
        int max = 100000;
         random_int = (int)(Math.random() * (max - min + 1) + min);
        
    	
        // Recipient's email ID needs to be mentioned.
        String to = email;

        // Sender's email ID needs to be mentioned
        String from = "appchateproject@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("appchateproject@gmail.com", "Appchat12345");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("Your code is "+random_int + " please do not show it to anyone!");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
		return random_int;

	}
	
	public String SendPass(String email) {
	  	//random code
    	
    		// ASCII range - alphanumeric (0-9, a-z, A-Z)
    		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    		SecureRandom random = new SecureRandom();
    		StringBuilder sb = new StringBuilder();

    		// each iteration of loop choose a character randomly from the given ASCII range
    		// and append it to StringBuilder instance

    		for (int i = 0; i < 10; i++) {
    			int randomIndex = random.nextInt(chars.length());
    			sb.append(chars.charAt(randomIndex));
    		}
    		String RandomPass = sb.toString();

    		
        // Recipient's email ID needs to be mentioned.
        String to = email;

        // Sender's email ID needs to be mentioned
        String from = "appchateproject@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("appchateproject@gmail.com", "Appchat12345");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
  
            message.setText("Your code is "+RandomPass + " please do not show it to anyone!");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
		return RandomPass;

	}
}

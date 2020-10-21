package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.mindrot.jbcrypt.BCrypt;

import dao.AccountDao;
import entity.Account;

import helper.CheckForm;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import javax.swing.SwingConstants;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JTextField txtEmail;
	private JButton btnSignUp;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtUserName;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtFullName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel()
		;
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		setIconImage(new ImageIcon("unnamed.png").getImage());
		
		lblNewLabel = new JLabel("") {
            ImageIcon icon = new ImageIcon("unnamed.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
		
		lblNewLabel_1 = new JLabel("SignUp");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 30));
		
		panel_1 = new JPanel() {
            ImageIcon icon = new ImageIcon("bg1.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
		panel_1.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(79, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addGap(61))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(43)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addGap(4)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		txtEmail = new JTextField();
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
				txtEmail.setForeground(Color.BLACK);
			}
		});
		txtEmail.setForeground(Color.GRAY);
		txtEmail.setText("Enter You Email");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 rbtSignUpActionPerformed(e);
			}
		});
		btnSignUp.setFont(new Font("Sylfaen", Font.BOLD, 21));
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText("");
				passwordField.setEchoChar('●');
				passwordField.setForeground(Color.BLACK);
				
			}
		});
		passwordField.setText("Enter Password");
		passwordField.setForeground(Color.GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(10, 99, 262, 33);
		 passwordField.setEchoChar((char)0);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField_1.setText("");
				passwordField_1.setEchoChar('●');
				passwordField_1.setForeground(Color.BLACK);
			}
		});
		passwordField_1.setText("Enter Request Password");
		passwordField_1.setForeground(Color.GRAY);
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField_1.setBounds(10, 99, 262, 33);
		 passwordField_1.setEchoChar((char)0);
		
		txtUserName = new JTextField();
		txtUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUserName.setText("");
				txtUserName.setForeground(Color.BLACK);
			}
		});
		txtUserName.setForeground(Color.GRAY);
		txtUserName.setText("Enter UserName");
		txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUserName.setColumns(10);
		
		lblNewLabel_2 = new JLabel("You have an account ?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_3 = new JLabel("<html><u> SignIn now</u></html> ");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3(e);
			}
		});
		lblNewLabel_3.setForeground(Color.BLUE);
		
		txtFullName = new JTextField();
		txtFullName.setText("Enter FullName");
		txtFullName.setForeground(Color.GRAY);
		txtFullName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFullName.setColumns(10);
		txtFullName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFullName.setText("");
				txtFullName.setForeground(Color.BLACK);
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(70)
							.addComponent(btnSignUp, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(52, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addGap(13))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(txtFullName, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addGap(13))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(6)
					.addComponent(txtFullName, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(btnSignUp, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
	}
	protected void lblNewLabel_3(MouseEvent e) {
		new SignIn().setVisible(true);
		this.setVisible(false);
	}
	private void rbtSignUpActionPerformed(ActionEvent e) {
		
		if(txtFullName.getText().equals("")) {
			JOptionPane.showMessageDialog(this,"Please enter your name");
		}else if( CheckForm.checkFullname(txtFullName.getText())==false) {
			JOptionPane.showMessageDialog(this,"Fullname is not in the correct format");
		}else if(txtUserName.getText().equals("")) {
			JOptionPane.showMessageDialog(this,"Please enter your username");
		}else if( CheckForm.checkUsername(txtUserName.getText())==false) {
			JOptionPane.showMessageDialog(this,"Username is not in the correct format");	
		}else if(txtEmail.getText().equals("")) {
			JOptionPane.showMessageDialog(this,"Please enter your email");	
		}else if( CheckForm.checkEmail(txtEmail.getText())==false) {
			JOptionPane.showMessageDialog(this,"Email is not in the correct format");	
		}else if(passwordField.getText().equals("")) {
			JOptionPane.showMessageDialog(this,"Please enter your password");	
		}else if( CheckForm.checkPassword(passwordField.getText())==false) {
			JOptionPane.showMessageDialog(this,"Password is not in the correct format");	
		}else if(passwordField_1.getText().equals("") && passwordField!=passwordField_1) {
			JOptionPane.showMessageDialog(this,"Request password not correct"," Please enter again!", JOptionPane.ERROR_MESSAGE);	
		}else {
			var dao = new AccountDao();
			Account acc = new Account();
			acc.setFullname(txtFullName.getText());
			acc.setAccount(txtUserName.getText());
			acc.setEmail(txtEmail.getText());
			String hash = BCrypt.hashpw(passwordField.getText(), BCrypt.gensalt(4));		
			acc.setPass(hash);
			
			dao.insertAccount(acc);	
			
			new SignIn().setVisible(true);
			}
		}
}

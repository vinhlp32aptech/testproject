package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.mindrot.jbcrypt.BCrypt;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import common.ConnectDB;
import dao.AccountDao;
import entity.Account;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.DriverManager;
import java.time.ZoneId;
import java.awt.event.ActionEvent;

public class UpdateAccount extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField textFullname;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox cbbGender;
	private JLabel lblNewLabel_3;
	private JTextField textPhone;
	private JLabel lblNewLabel_4;
	private JTextField textEmail;
	private JLabel lblNewLabel_5;
	private JButton btnUpdate;
	private JLabel lblNewLabel_6;
	private JTextField textAddr;
	private Account acc;
	private SignIn sign;
	
	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public SignIn getSign() {
		return sign;
	}

	public void setSign(SignIn sign) {
		this.sign = sign;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateAccount frame = new UpdateAccount();
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
	public UpdateAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 530);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		dateChooser = new JDateChooser();
		
		textFullname = new JTextField();
		textFullname.setColumns(10);
		
		lblNewLabel = new JLabel("FULLNAME :");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		lblNewLabel_1 = new JLabel("DATE OF BIRTH :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		lblNewLabel_2 = new JLabel("GENDER :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		cbbGender = new JComboBox();
		cbbGender.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "---", "MALE", "FEMALE", "OTHER", "---"}));
		
		lblNewLabel_3 = new JLabel("PHONE NUMBER :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		
		lblNewLabel_4 = new JLabel("EMAIL :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		lblNewLabel_5 = new JLabel("UPDATE ACCOUNT");
		lblNewLabel_5.setForeground(SystemColor.activeCaption);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btnUpdate = new JButton("CONFIRM");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateActionPerformed(e);
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_6 = new JLabel("ADDRESS :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		textAddr = new JTextField();
		textAddr.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(127)
					.addComponent(lblNewLabel_5)
					.addContainerGap(128, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(89)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(textAddr, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(textEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(textPhone, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(cbbGender, Alignment.LEADING, 0, 226, Short.MAX_VALUE)
								.addComponent(dateChooser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(textFullname, Alignment.LEADING, 226, 226, Short.MAX_VALUE))
							.addGap(78)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(152, Short.MAX_VALUE)
					.addComponent(btnUpdate)
					.addGap(150))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_5)
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_2)
					.addGap(11)
					.addComponent(cbbGender, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_6)
					.addGap(11)
					.addComponent(textAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpdate)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnUpdateActionPerformed(ActionEvent e) {
		var account = new Account();
		
		account.setFullname(textFullname.getText());
		account.setDob(dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		account.setPhone(Integer.parseInt(textPhone.getText()));
		account.setEmail(textEmail.getText());
		account.setAddr(textAddr.getText());;
		

		new AccountDao().UpdateAccount(account,cbbGender.getSelectedItem().toString(),acc.getId_acc());
		
	}
}

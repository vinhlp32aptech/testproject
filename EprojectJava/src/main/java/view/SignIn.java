package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


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

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JButton btnSignIn;
	private JCheckBox chckbxNewCheckBox;
	private JTextField txtUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
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
		
		lblNewLabel_1 = new JLabel("SignIn");
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
					.addContainerGap(49, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addGap(104))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
							.addGap(44))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
      
		btnSignIn = new JButton("Sign in")
           ;
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 rbtSignInActionPerformed(e);
			}
		});
		btnSignIn.setBounds(68, 197, 152, 36);
		btnSignIn.setFont(new Font("Sylfaen", Font.BOLD, 18));
		
		chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setBounds(10, 158, 93, 21);
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.setBackground(new Color(204, 255, 255));
		
		JLabel lblNewLabel_2 = new JLabel("You don't have an account ?");
		lblNewLabel_2.setBounds(26, 243, 150, 20);
		
		JLabel lblNewLabel_3 = new JLabel("<html><u> SignUp now</u></html> ");
		lblNewLabel_3.setBounds(194, 247, 78, 13);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3(e);
				
			}
		});
		lblNewLabel_3.setForeground(Color.BLUE);
		
		JRadioButton rbtHien = new JRadioButton("Visibly");
		rbtHien.setBounds(197, 142, 75, 21);
		rbtHien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   if (rbtHien.isSelected()) {
					   rbtHienActionPerformed(e);
				   } else {
					   passwordField.setEchoChar('●');
				   }
				
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnSignIn);
		panel_1.add(chckbxNewCheckBox);
		panel_1.add(rbtHien);
		panel_1.add(lblNewLabel_2);
		panel_1.add(lblNewLabel_3);
		
		txtUserName = new JTextField();
		txtUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUserName.setText("");
				txtUserName.setForeground(Color.BLACK);
			}
		});
		txtUserName.setText("Enter UserName");
//		txtUserName.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent e) {
//				if(txtUserName.getText().equals("Enter UserName")) {
//					txtUserName.setText("");
//					
//				}
//				txtUserName.setForeground(Color.BLACK);
//			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(txtUserName.getText().equals("")) {
//					txtUserName.setText("Enter UserName");
//					
//				}
//				txtUserName.setForeground(Color.GRAY);
//			}
//			
//		});
		
		txtUserName.setForeground(Color.GRAY);
		txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUserName.setBounds(10, 41, 262, 33);
		panel_1.add(txtUserName);
		txtUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clickabc(e);
			}
		});
		passwordField.setText("Enter Password");
		passwordField.setForeground(Color.GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(10, 99, 262, 33);
		 passwordField.setEchoChar((char)0);
		panel_1.add(passwordField);
		panel.setLayout(gl_panel);
	}
	protected void lblNewLabel_3(MouseEvent e) {
		new SignUp().setVisible(true);
		this.setVisible(false);
	}
	
	private void rbtHienActionPerformed(ActionEvent e) {  
		 passwordField.setEchoChar((char)0);
		}
	protected void clickabc(MouseEvent e) {
		passwordField.setText("");
		 passwordField.setEchoChar('●');
		 passwordField.setForeground(Color.BLACK);
		
	}

	private void rbtSignInActionPerformed(ActionEvent e) {  

		if(txtUserName.getText().equals("")) {
			JOptionPane.showMessageDialog(this,"Please enter your username");	
		}else if(passwordField.getText().equals("")) {
			JOptionPane.showMessageDialog(this,"Please enter your password");	
		}
		}
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblGender;
	private JLabel lblDob;
	private JLabel lblPhone;
	private JLabel lblEmail;
	private JLabel lblAdddress;
	private JLabel lblUser;
	private JLabel lblCodeMess;
	private JTextField txtAdddress;
	private JTextField txtUser;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtCodeMess;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JScrollPane scrollPane_1;
	private JTextField txtUsername;
	private JButton btnChooseAnImage;
	private JTextField txtPassword;
	private JLabel lblUserInformation;
	private JLabel lblCity;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextField textField_7;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JTextField txtConfrim;
	private JComboBox comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setLocationRelativeTo(null);
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
	public Admin() {
		setTitle("Admin ✿◕ ‿ ◕✿ ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 761);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Id & User :");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		
		scrollPane = new JScrollPane();
		
		btnNewButton = new JButton("LOAD");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		lblNewLabel_13 = new JLabel("Search :");
		lblNewLabel_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_13)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_13))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		panel_2 = new JPanel();
		
		btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
					.addGap(139)
					.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(128)
					.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_2))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		btnNewButton_5 = new JButton("Reset");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5ActionPerformed(e);
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblDob = new JLabel("Dob :");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblPhone = new JLabel("Phone :");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblAdddress = new JLabel("Adddress :");
		lblAdddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblUser = new JLabel("User :");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblCodeMess = new JLabel("Code Mess :");
		lblCodeMess.setForeground(Color.BLACK);
		lblCodeMess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtAdddress = new JTextField();
		txtAdddress.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		
		txtCodeMess = new JTextField();
		txtCodeMess.setColumns(10);
		
		dateChooser = new JDateChooser();
		
		lblNewLabel_9 = new JLabel("");
		
		lblNewLabel_10 = new JLabel("Avatar :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_11 = new JLabel("UserName :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_12 = new JLabel("Password :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		scrollPane_1 = new JScrollPane();
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		
		btnChooseAnImage = new JButton("📸 Choose an image");
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		
		btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		lblCity = new JLabel("City&county/district :");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"City & county", "..............", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Hà Nội", "TP. HỒ CHÍ MINH", "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Phú Yên", "......................"}));
		comboBox.setToolTipText("");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"District", "....................", "Quận 1", "Quận 12", "Quận Thủ Đức", "Quận 9", "Quận Gò Vấp", "Quận Bình Thạnh", "Quận Tân Bình", "Quận Tân Phú", "Quận Phú Nhuận", "Quận 2", "Quận 3", "Quận 10", "Quận 11", "Quận 4", "Quận 5", "Quận 6", "Quận 8", "Quận Bình Tân", "Quận 7", "Huyện Củ Chi", "Huyện Hóc Môn", "Huyện Bình Chánh", "Huyện Nhà Bè", "Huyện Cần Giờ", ".............................."}));
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_15 = new JLabel("Confirm :");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtConfrim = new JTextField();
		txtConfrim.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select ", "............", "Male", "female", "Other", "..........."}));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
							.addGap(371)
							.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblGender, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
											.addGap(52))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblDob, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
											.addGap(73))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblPhone, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
											.addGap(59))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
											.addGap(66))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblAdddress, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
											.addGap(39))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblUser, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
											.addGap(69)))
									.addGap(28))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblCity)
									.addGap(31))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblCodeMess, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(comboBox, 0, 131, Short.MAX_VALUE)
									.addGap(5)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addGap(145))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(txtAdddress, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
									.addGap(61)
									.addComponent(btnChooseAnImage, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
										.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
										.addComponent(txtPhone, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
										.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(comboBox_2, 0, 145, Short.MAX_VALUE)
												.addComponent(txtCodeMess, 119, 145, Short.MAX_VALUE))))
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_14)
										.addComponent(lblNewLabel_9)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
													.addGap(36))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblNewLabel_15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGap(37)))
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
												.addComponent(txtUsername, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
												.addComponent(txtConfrim, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))))))
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_14)
						.addComponent(lblNewLabel_15)
						.addComponent(txtConfrim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodeMess, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodeMess))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_11)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDob)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_10, Alignment.TRAILING))
							.addGap(28)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhone))
							.addGap(28)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail)))
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdddress)
						.addComponent(txtAdddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnChooseAnImage))
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCity)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		panel_1.setLayout(gl_panel_1);
		
		lblUserInformation = new JLabel("User information :");
		lblUserInformation.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUserInformation, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUserInformation, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnNewButton_5ActionPerformed(ActionEvent e) { // đây là nút Reset
		txtUser.setText("");
		txtCodeMess.setText("");
		txtPhone.setText("");
		txtEmail.setText("");
		txtAdddress.setText("");
		txtPassword.setText("");
		txtConfrim.setText("");
		txtUsername.setText("");
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.mindrot.jbcrypt.BCrypt;

import javax.swing.DefaultRowSorter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowFilter;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Component;
import com.toedter.calendar.JDateChooser;

import dao.AdminDao;
import dao.AccountDao;
import entity.Account;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JButton btnLoad;
	private JScrollPane scrollPane;
	private JTable table;
	private JPanel panel;
	private JTextField txtxfd;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField txtFullname;
	private JLabel lblGender;
	private JLabel lblAdddress;
	private JTextField txtAddr;
	private JLabel lblEmail;
	private JLabel lblNewLabel_1;
	private JTextField txtPhone;
	private JLabel lblPhone;
	private JLabel lblNewLabel_2;
	private JDateChooser dateChooser;
	private JLabel lblDob;
	private JTextField txtEmail;
	private JButton btnReset;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JPanel panel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtID;
	private JButton btnDel;
	private JTextField txtGender;
	private JLabel lblNewLabel_3;
	private JTextField txtAcc;
	private JLabel lblNewLabel_5;

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
		setTitle("Admin ✿◕ ‿ ◕✿ " );
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 571);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Search :", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		
		panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		lblNewLabel = new JLabel("Fullname :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtFullname = new JTextField();
		txtFullname.setColumns(10);
		
		lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblAdddress = new JLabel("Adddress :");
		lblAdddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtAddr = new JTextField();
		txtAddr.setColumns(10);
		
		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_1 = new JLabel("");
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		
		lblPhone = new JLabel("Phone :");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		dateChooser = new JDateChooser();
		
		lblDob = new JLabel("Date of Birth :");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResetActionPerformed(e);
			}
		});
		btnReset.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		txtGender = new JTextField();
		txtGender.setColumns(10);
		
		lblNewLabel_3 = new JLabel("User Account :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtAcc = new JTextField();
		txtAcc.setColumns(10);
		
		lblNewLabel_5 = new JLabel("ACCOUNT INFORMATION :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 18));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(173)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblDob, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblPhone, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(txtAddr, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtAcc, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPhone, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
							.addGap(48)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(32))))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(173)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addContainerGap())
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblAdddress, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(289, Short.MAX_VALUE))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtGender)
									.addComponent(txtFullname, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
								.addGap(153)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_1)
									.addComponent(lblNewLabel_2))
								.addGap(38)))))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5)
					.addContainerGap(495, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5)
					.addGap(5)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2)
						.addComponent(txtFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(44)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addComponent(lblGender)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)))
					.addComponent(lblAdddress)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDob)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPhone)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnReset)
						.addComponent(txtAcc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
					.addGap(35))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		txtxfd = new JTextField();
		txtxfd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldActionPerformed(e);
			}
		});
		txtxfd.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tableMouseClicked(e);
			}
		});
		table.setAlignmentX(Component.RIGHT_ALIGNMENT);
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		
		btnLoad = new JButton("LOAD");
		btnLoad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLoad.setForeground(Color.BLACK);
		btnLoad.setBackground(Color.WHITE);
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoadActionPerformed(e);
			}
		});
		
		panel_3 = new JPanel();
		
		lblNewLabel_4 = new JLabel("ID Acc :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		btnDel = new JButton("Delete");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDelActionPerformed(e);
			}
		});
		
		btnDel.setBackground(Color.RED);
		btnDel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.GREEN);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddActionPerformed(e);
			}
		});
		btnAdd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateActionPerformed(e);
			}
		});

		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addGap(35)
							.addComponent(txtID))
						.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(btnDel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(17, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDel)
						.addComponent(btnUpdate)
						.addComponent(btnAdd))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtxfd, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnLoad)
							.addGap(26))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtxfd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLoad))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnLoadActionPerformed(ActionEvent e) {
	AdminDao dao = new AdminDao ();
		
		LoadAdmin(dao);
		
		
		}

	private void LoadAdmin(AdminDao dao) {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Fullname");
		model.addColumn("Gender");
		model.addColumn("Adddress");
		model.addColumn("Dob");
		model.addColumn("Phone");
		model.addColumn("Email");
		model.addColumn("Account");
		
		for(Account acc :dao.getListAppChat()) {
			model.addRow(new Object[] {acc.getId_acc(),acc.getFullname(),acc.getGender(), acc.getAddr() , acc.getDob(), acc.getPhone(),acc.getEmail(),acc.getAccount() });	
		}
		table.setModel(model);
	}
	protected void textFieldActionPerformed(ActionEvent e) {
		String find = txtxfd.getText();
		DefaultRowSorter<?,?> sorter = (DefaultRowSorter) table.getRowSorter();
		sorter.setRowFilter(RowFilter.regexFilter(find));
		sorter.setSortKeys(null);
	}
	
	protected void tableMouseClicked(MouseEvent e) {
		int rowindex = table.getSelectedRow();
		
		txtFullname.setText(table.getValueAt(rowindex,1).toString());
		txtGender.setText(table.getValueAt(rowindex,2).toString());
		txtAddr.setText(table.getValueAt(rowindex,3).toString());
		
		
		try {
			dateChooser.setDate(
					new SimpleDateFormat("yyyy-MM-dd").parse(table.getValueAt(rowindex, 4).toString())
					);
			
			
			}catch(ParseException e1) {
				
				e1.printStackTrace();
			}
		txtPhone.setText(table.getValueAt(rowindex, 5).toString());
		txtEmail.setText(table.getValueAt(rowindex, 6).toString());
		txtAcc.setText(table.getValueAt(rowindex, 7).toString());
		
	}

	protected void btnAddActionPerformed(ActionEvent e) {
		AdminDao dao = new AdminDao();
		Account acc = new Account();
		if(txtFullname.getText().equals("")
				||(dateChooser.getDate().equals("")||(txtPhone.getText().equals("")||(txtEmail.getText().equals("")
						||(txtAddr.getText().equals("")||(txtGender.getText().equals(""))))))){
			JOptionPane.showMessageDialog(this, "Please enter your information!");
			
		}
		
		
		acc.setFullname(txtFullname.getText());
		acc.setGender(txtGender.getText());
		acc.setDob(dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		acc.setPhone(Integer.parseInt(txtPhone.getText()));
		acc.setEmail(txtEmail.getText());
		acc.setAddr(txtAddr.getText());
		acc.setAccount(txtAcc.getText());
		
		
		
		
		dao.AddAccount(acc);
		JOptionPane.showMessageDialog(null, "Add a successful account");
		
	}

	protected void btnDelActionPerformed(ActionEvent e) {
		if(txtFullname.getText().equals("") ||txtGender.getText().equals("") ||txtAddr.getText().equals("") ||dateChooser.getDate().equals("") ||txtPhone.getText().equals("") ||txtEmail.getText().equals("") ||txtAcc.getText().equals("") ) {
        	JOptionPane.showMessageDialog(null, "Please check, click on the Account you want to delete");
        	return;
		}
		if(txtID.getText().equals("") ) {
        	JOptionPane.showMessageDialog(null, "Please check ,enter the id you want to delete");
        	return;
		}
		int id = Integer.parseInt(txtID.getText());
		new AdminDao().DelAcc(id);
		JOptionPane.showMessageDialog(null, "DELETE SUCCESS ! PLease click on the load button to update data ");
	}
	protected void btnResetActionPerformed(ActionEvent e) {
		txtFullname.setText("");
		txtGender.setText("");
		txtAddr.setText("");
		txtAcc.setText("");
		txtPhone.setText("");
		txtEmail.setText("");
		dateChooser.setDate(null);
		
	}
	protected void btnUpdateActionPerformed(ActionEvent e) {
		AdminUpdateAccount Up = new AdminUpdateAccount();
		Up.setVisible(true);
//		this.setVisible(false);
		
	}
}
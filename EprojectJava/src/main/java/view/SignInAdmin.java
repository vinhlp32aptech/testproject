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
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SignInAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInAdmin frame = new SignInAdmin();
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
	public SignInAdmin() {
		setTitle("Admin ✿◕ ‿ ◕✿ ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 761);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 958, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 729, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
//	JToggleButton toggleButton = new JToggleButton("Click Me");
//	ItemListener itemListener = new ItemListener() {
//	    public void itemStateChanged(ItemEvent itemEvent) {
//	        int state = itemEvent.getStateChange();
//	        if (state == ItemEvent.SELECTED) {
//	            System.out.println("Selected"); // show your message here
//	        } else {
//	            System.out.println("Deselected"); // remove your message
//	        }
//	    }
//	};
//	toggleButton.addItemListener(itemListener);
//	
}

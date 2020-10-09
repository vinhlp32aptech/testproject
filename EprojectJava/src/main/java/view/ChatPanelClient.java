package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ChatPanelClient extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatPanelClient frame = new ChatPanelClient();
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
	public ChatPanelClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 784);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		
		textArea_1 = new JTextArea();
		
		btnNewButton = new JButton("Send");
		
		lblNewLabel = new JLabel("Type message here to send.....");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		separator = new JSeparator();
		
		panel = new JPanel();
		
		panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(202)
											.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(21)
											.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(81)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

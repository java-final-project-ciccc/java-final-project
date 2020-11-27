package ca.java.admin.users;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import ca.java.common.login.LoginForm;

public class UserTop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserTop window = new UserTop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserTop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("User Top");
		frame.setBounds(700, 450, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Top");
		lblNewLabel.setBounds(180, 120, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnbackButton = new JButton("back");
		btnbackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm.main(null);
				frame.dispose();
			}
		});
		btnbackButton.setBounds(155, 182, 117, 29);
		frame.getContentPane().add(btnbackButton);
		
	}
}

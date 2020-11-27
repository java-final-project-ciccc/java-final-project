package ca.java.admin.top;

import java.awt.EventQueue;

import javax.swing.JFrame;

import ca.java.admin.users.AdminRegisterUser;
import ca.java.admin.users.AdminUserLists;
import ca.java.common.login.LoginForm;
import ca.java.db.connect.ConnectToUsersDatabases;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminTop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminTop window = new AdminTop();
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
	public AdminTop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ConnectToUsersDatabases dao = new ConnectToUsersDatabases();
		
		frame = new JFrame();
		frame.setTitle("Admin Top");
		frame.setBounds(700, 450, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnUserListButton = new JButton("User list");
		btnUserListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao.selectAllQuery();
				AdminUserLists.main(null);
				frame.dispose();
			}
		});
		btnUserListButton.setBounds(151, 66, 117, 29);
		frame.getContentPane().add(btnUserListButton);
		
		JButton btnRegisterButton = new JButton("Register");
		btnRegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminRegisterUser.main(null);
				frame.dispose();
			}
		});
		btnRegisterButton.setBounds(151, 125, 117, 29);
		frame.getContentPane().add(btnRegisterButton);
		
		JButton btnGoBackButton = new JButton("Go Back");
		btnGoBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm.main(null);
				frame.dispose();
			}
		});
		btnGoBackButton.setBounds(151, 192, 117, 29);
		frame.getContentPane().add(btnGoBackButton);
	}
}

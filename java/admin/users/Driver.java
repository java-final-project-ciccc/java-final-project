package ca.java.admin.users;

import ca.java.db.connect.ConnectToUsersDatabases;

//import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("xxx");
		
//		User user01 = new User("hiro", "egawa", "xxx@ddd", "1234");
//		System.out.println(user01);
		
		
		// check user list from user table
		ConnectToUsersDatabases dao = new ConnectToUsersDatabases();
		dao.selectAllQuery();
		System.out.println();
		
		// check one user from user table
		dao.selectOneQuery("test@fff", "4040");
		
		// check user book list from book and user
		
		// update user data into user table
		dao.updateQuery("update", "test@fff", "4040");
		
		// insert new user data into user table
		//dao.insertQuery("jack", "marc", "marc@gmail.com", "qazxsw");
		
		
		// delete new user data from user table
		//dao.deleteQuery("marc@gmail.com", "qazxsw");
		
		// delete user book list from book
	}

}

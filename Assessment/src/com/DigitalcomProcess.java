package com;

import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String[] args) {
		GameService gs = new GameService();
//		System.out.println(gs.authorSearch(null));
		while(true) {
			int choice;
			Scanner sc = new Scanner(System.in);
			System.out.println("Main Menu - Choices");
			System.out.println("1) RegisterUser");
			System.out.println("2) ViewGames");
			System.out.println("3) searchByName");
			System.out.println("4) Exit");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Please enter userid and password");
				String userid, password;
				System.out.println("Enter userid");
				userid = sc.next();
				System.out.println("Enter password");
				password = sc.next();
				User u = new User();
				u.addUser(userid, password);
				break;
			
			case 2:
				System.out.println("Below is the view of all games");
//				System.out.println(gs.viewAll());
				gs.viewAll().forEach(System.out::println);
				break;
				
			case 3:
				System.out.println("Enter the name of the author");
				String author;
				author = sc.next();
				System.out.println(gs.authorSearch(author));
				break;
			case 4:
				return;
			default:
				break;
		}
	}
}
}

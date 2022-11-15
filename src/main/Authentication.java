package main;
import java.util.*;

import controllers.UserController;
import models.User;
public class Authentication {
	private static Scanner in = new Scanner(System.in);
	
	public static User startAuthentication() {
		int n=0;

		println("WELCOME TO COUPON BUSTERS...");
		
		while(n!=3) {
			
			println("1)Register");
			println("2)Login");
			println("3)Exit");
			
			newLine();

			print("Select an option: ");
			n = in.nextInt();
			
			newLine();
			
			switch(n) {
				case 1:
					register();
					break;
				case 2:
					login();
					break;
				default:
					continue;
			}
			
		}
		
		return null;
	}
	
	private static User register() {
		String name, email, password;
		
		print("Enter your Name: ");
		name = in.nextLine();
		
		print("Enter your Email: ");
		email = in.nextLine();
		
		print("Enter your Password: ");
		password = in.nextLine();
		
		return(UserController.register(name, email, password));
		
	}
	private static User login() {
String email, password;
		
		
		print("Enter your Email");
		email = in.next();
		
		print("Enter your Password");
		password = in.next();
		
		return(UserController.login(email, password));
		
	}

	
	private static void println(String string) {
		System.out.println(string);
		
	}
	private static void print(String string) {
		System.out.print(string);
		
	}
	private static void newLine() {
		System.out.print("\n");
		
	}
}

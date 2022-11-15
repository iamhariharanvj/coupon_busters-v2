package main;

import controllers.UserController;
import models.User;

public class Main {
	public static void main(String[] args) {
		User currUser = Authentication.startAuthentication();
	}

	
}

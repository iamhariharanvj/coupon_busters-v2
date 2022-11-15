package controllers;

import models.User;
import java.io.*;
import config.Constants;

public class UserController {
	public static User findUserByEmail(String email) {
		
		final int EMAIL_INDEX = 1;
		final String DELIMITER = ",";
		
		String line;

		try {
			File csvFile = new File(Constants.USERDB_FILENAME);
			FileReader fr = new FileReader(csvFile);
			BufferedReader csvReader = new BufferedReader(fr);
			
			
			
			while((line = csvReader.readLine())!=null) {
				String[] userAttr = line.split(",");
				
				if(email.equals(userAttr[EMAIL_INDEX])) {
					return new User(userAttr[0], userAttr[1], userAttr[2]);
				};
			}
			
			csvReader.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return null;
	}
	
	public static User register(String name, String email, String password) {
		
		if(findUserByEmail(email) != null) {
			System.out.println("There is an existing user with the specified email address");
			return null;
		}
		
		User newUser =  new User(name, email, password);
		FileWriter dbWriter = null;
		try {
			
			dbWriter = new FileWriter(Constants.USERDB_FILENAME);	
			dbWriter.append(String.join(",", newUser.toList()));
			dbWriter.append('\n');	
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			if(dbWriter != null) {
				try {
					dbWriter.flush();
					dbWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return newUser;
		
	}
	
	public static User login(String email, String password) {
		User currUser = null;
		
		if((currUser = findUserByEmail(email))==null) {
			System.out.println("Invalid Email Address");
		}
		else if(currUser.checkPassword(password)) {
			return currUser;
		}
		
		return null;
	}

}
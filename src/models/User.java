package models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import config.Constants;

public class User implements Buyer, Seller{
	private String name = "";
	private String email = "";
	private String password = "";
	private String location = "";
	private ArrayList<Product> Cart;

	public User(String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
		this.Cart = new ArrayList<Product>();
	}
	
	public Boolean checkPassword(String password) {
		if(this.password == password) {
			return true;
		}
		return false;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public ArrayList<String> toList() {
		ArrayList<String> userAttributes = new ArrayList<String>();
		userAttributes.add(name);
		userAttributes.add(email);
		userAttributes.add(password);
		userAttributes.add(location);
		
		return userAttributes;	
	}

	@Override
	public void addProduct(Product item) {
 
		
	 
		FileWriter dbWriter = null;
		try {
			
			dbWriter = new FileWriter(Constants.PRODUCTDB_FILENAME);	
			dbWriter.append(String.join(",", item.toList()));
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
	}

	@Override
	public void addBatchProduct(ArrayList<Product> products) {
		for(int i =0; i<products.size(); i++) {
			addProduct(products.get(i));
		}
		
	}

	

	@Override
	public void addToCart(Product item, int quantity) {
		for(int i=0; i<quantity; i++) {
			Cart.add(item);
		}
		
	}

	@Override
	public void removeFromCart(Product item) {
		for(int i=0; i<Cart.size(); i++) {
			if(Cart.get(i) == item) {
				Cart.remove(i);
			}
		}
	}

	@Override
	public void displayCart() {
		for(int i=0; i<Cart.size(); i++) {
			Cart.get(i).display();
		}
	}
	
}

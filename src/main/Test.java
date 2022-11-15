package main;
import models.Clothing;
import models.Food;
import models.Product;
import models.User;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product Chair = new Product("Chair", 10, "furniture", 1000,"Paravai Market", "Gugai, Salem");
		Food Apple = new Food("Apple",1, "Kg", 10, 150, "Iyarkai Market", "Old Bus Stand Road, Pudhukottai");
		Clothing Shirt = new Clothing("Shirt(Black)", "M", "Male", 12, 499, "Aunty Uncle", "Vilaku Thoon Madurai");
	
		ArrayList<Product> prodList = new ArrayList<Product>();
		
		for(int i=0; i<3; i++) {
			prodList.add(Apple);
			prodList.add(Chair);
			prodList.add(Shirt);
		}
		
		
		User currUser = new User("Hari", "hariharanvj2003@gmail.com", "password");
		currUser.addProduct(Chair);
		currUser.addBatchProduct(prodList);
		currUser.addToCart(Shirt, 3);
		currUser.displayCart();
		
	}
}

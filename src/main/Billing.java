package main;
import models.Product;
import java.util.*;

public class Billing {

	private static String[] PROMOCODE_LIST = {"TRYNEW","GET30", "AXISIO", "MASTER11", "THISDIWALI"};
	public static float getBill(ArrayList<Product> prodList) {
		int total=0;
		for(int i=0; i<prodList.size(); i++) {
			total += prodList.get(i).getPrice();
		}
		
		return total;
	}
	
	public static float getBill(ArrayList<Product> prodList, String promoCode) {
		int i=0;
		int total=0;
		
		while(PROMOCODE_LIST[i] != null) {
			if(PROMOCODE_LIST[i].equals(promoCode)) {
				for(int j=0; j<prodList.size(); j++) {
					total += prodList.get(j).getPrice()* (100-promoCode.length())/100;
				}
				return total;
			}
			
		}
		
		for(int j=0; j<prodList.size(); j++) {
			total += prodList.get(j).getPrice()/100;
		}
		
		return total;
		
	}
	
	public static float getBill(ArrayList<Product> prodList, float discount) {
		int total=0;
		for(int i=0; i<prodList.size(); i++) {
			total += prodList.get(i).getPrice()* (100-discount)/100;
		}
		
		return total;
	}
	
	
	
}

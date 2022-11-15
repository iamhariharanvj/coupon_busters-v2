package models;
import java.util.ArrayList;

public interface Buyer {
 
	
	public void addToCart( Product item, int quantity);

	public void removeFromCart(Product item);
	
	public void displayCart();

	
}

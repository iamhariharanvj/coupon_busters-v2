package models;

public class Food extends Product{

	private float quantity;
	private String unit;
	
	public Food(String name,float quantity,String unit, float discount, float price, String sellerName, String sellerAddress) {
		super(name, discount, "food", price, sellerName, sellerAddress);
		this.quantity = quantity;
		this.unit = unit;
	}
	public float getQuantity() {
		return this.quantity;
	}
	public String getUnit() {
		return this.unit;
	}
	public void changeQuantity(int quantity) {
		super.setPrice(quantity* super.getPrice() /this.quantity);
		this.quantity = quantity;
	}
	
	@Override
	public  void display() {
    	System.out.println("Name     : "+super.getName());
    	System.out.println("Quantity : "+this.quantity);
    	System.out.println("Price    : "+super.getPrice());
    	System.out.println("Category : "+super.getCategory());
    	System.out.println("Seller   : "+super.getSellerName());
    }

}

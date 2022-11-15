package models;

public class Clothing extends Product{

	private String size;
	private String gender;
	
	public Clothing(String name,String size,String gender, float discount, float price, String sellerName, String sellerAddress) {
		super(name, discount, "food", price, sellerName, sellerAddress);
		this.gender = gender;
		this.size = size;
	}
	public String getSize() {
		return this.size;
	}
	public String getGender() {
		return this.gender;
	}
	
	@Override
	public  void display() {
    	System.out.println("Name     : "+super.getName());
    	System.out.println("Size:    : "+this.size);
    	System.out.println("Gender:    : "+this.gender);
    	System.out.println("Price    : "+super.getPrice());
    	System.out.println("Category : "+super.getCategory());
    	System.out.println("Seller   : "+super.getSellerName());
    }

}

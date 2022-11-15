package models;

import java.util.ArrayList;

public class Product {
    private String name;
    private Float discount;
    private  String category;
    private Float price;
    private String sellerName;
    private String sellerAddress;
    
    public Product(String name, float discount, String category, float price, String sellerName, String sellerAddress){
    	this.name = name;
    	this.discount = discount;
    	this.category = category;
    	this.price = price;
    	this.sellerName = sellerName;
    	this.sellerAddress = sellerAddress;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setDiscount(Float discount){
        this.discount = discount;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(Float price){
        this.price = price;
    }
    public void setSellerName(String sellerName){
        this.sellerName = sellerName;
    }
    public void setSellerAddress(String sellerAddress){
        this.sellerAddress = sellerAddress;
    }
  
    public String getName(){
        return this.name;
    }
    public Float getPrice(){
        return this.price;
    }
    public Float getDiscount(){
        return this.discount;
    }
    public String getCategory(){
        return this.category;
    }
    public String getSellerName(){
        return this.sellerName;
    }
    public String getSellerAddress(){
        return this.sellerAddress;
    }
    
    public ArrayList<String> toList() {
		ArrayList<String> product = new ArrayList<String>();
		product.add(this.name);
		product.add(this.price.toString());
		product.add(this.discount.toString());
		product.add(this.category);
		product.add(this.sellerName);
		product.add(this.sellerAddress);
		
		return product;
	}

     
    public  void display() {
    	System.out.println("Name  : "+this.name);
    	System.out.println("Price : "+this.price);
    	System.out.println("Category : "+this.category);
    	System.out.println("Seller : "+this.sellerName);
    }
    

}

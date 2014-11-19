/*
 * Liferay Inc.
 * Item.java
 * Purpose: To create an Item with given arguments.
 * 
 * @author: Jonathan Chow
 * @version: 1.0 11-2-14
 * 
 * Problem: Sales Taxes
 */
public class Item {
	String item; // name of item
	double price; // price of item
	int quantity; // how many of item
	boolean exempt; // exempt from tax or not
	boolean imp; // imported or not

	/**
	 * The Item constructor takes in a String, double, int, and two boolean values in order to create
	 * an instance of the object.
	 * 
	 * @param item Name of the item
	 * @param price Price of the item
	 * @param quantity Quantity of the item
	 * @param exempt Item is exempt from sales tax or not
	 * @param imp Item is imported or not
	 */
	public Item(String item, double price, int quantity, boolean exempt, boolean imp) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
		this.exempt = exempt;
		this.imp = imp;
	}
	
	public String getItem() {
		return item;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public boolean getExempt() {
		return exempt;
	}
	public boolean getImport() {
		return imp;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setExempt(boolean exempt) {
		this.exempt = exempt;
	}
	
	public void setImport(boolean imp) {
		this.imp = imp;
	}
}

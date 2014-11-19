/*
 * Liferay Inc.
 * Driver.java
 * Purpose: To print out the input of items in baskets and also its output with the total sales tax and
 * total of the items.
 * 
 * @author: Jonathan Chow
 * @version: 1.0 11-2-14
 * 
 * Problem: Sales Taxes
 */
public class Driver {

	/**
	 * The main method creates Item classes for individual items with the name of the item.
	 * price of the item, quantity of the item, boolean value if it is exempt from taxes,
	 * and a boolean value if the item is imported.  It also creates arrays that take in the Item object
	 * and stores items in their respective baskets.  It then creates a Calculator object which prints
	 * out the input of each basket with its individual items and prices and also outputs the items with
	 * their taxes applied and the total sales tax of every item and the total of the whole basket.
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Item item1 = new Item("book", 12.49, 1, true, false);
		Item item2 = new Item("music CD", 14.99, 1, false, false);
		Item item3 = new Item("chocolate bar", .85, 1, true, false);
		Item item4 = new Item("imported box of chocolates", 10.00, 1, true, true);
		Item item5 = new Item("import bottle of perfume", 47.50, 1, false, true);
		Item item6 = new Item("imported bottle of perfume", 27.99, 1, false, true);
		Item item7 = new Item("bottle of perfume", 18.99, 1, false, false);
		Item item8 = new Item("packet of headache pills", 9.75, 1, true, false);
		Item item9 = new Item("imported box of chocolates", 11.25, 1, true, true);
		Item [] basket1 = {item1, item2, item3};
		Item [] basket2 = {item4, item5};
		Item [] basket3 = {item6, item7, item8, item9};
		Calculator calculate = new Calculator();
		calculate.printInput(basket1);
		calculate.printInput(basket2);
		calculate.printInput(basket3);
		calculate.printOutput(basket1);
		calculate.printOutput(basket2);
		calculate.printOutput(basket3);
		}
}

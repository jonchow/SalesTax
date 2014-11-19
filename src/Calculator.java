/*
 * Liferay Inc.
 * Calculator.java
 * Purpose: To calculate the sales tax of items, print the input of items, and output the items with sales
 * tax applied, the total sales tax, and total for all the items.
 * 
 * @author: Jonathan Chow
 * @version: 1.0 11-2-14
 * 
 * Problem: Sales Taxes
 */

public class Calculator {
	final double NOT_EXEMPT = .1; // Tax rate for non-exempt items
	final double IMPORT = .05; // Tax rate for imported items
	double totalSalesTax = 0; // Total sales tax for all items
	double totalSale = 0; // Total for all the items with sales tax
	double salesTax; // Sales tax for one item
	int inputCounter = 1;
	int outputCounter = 1;
	
	
	/**
	 * Default constructor for calculator with no arguments
	 */
	public Calculator() {
		
	}
	
	/**
	 * The getSalesTax method determines if the item is exempt from taxes and if it is imported and
	 * returns the correct sales tax of the item.
	 * 
	 * @param test Item that is passed as an argument in order to see if the item is exempt and imported.
	 * @return Returns correct value for passed Item based on if it is exempt and/or imported
	 */
	public double getSalesTax(Item test) {
		if(!test.getExempt() && test.getImport()) {
			salesTax = NOT_EXEMPT + IMPORT;
			return salesTax;
		}
		else if(test.getImport()) {
			salesTax = IMPORT;
			return salesTax;
		}
		else if(!test.getExempt()){
			salesTax = NOT_EXEMPT;
			return salesTax;
		}
		else {
			return 0;
		}
		
	}
	
	/**
	 * The calculate method tests if an Item has a sales tax and if it does not, then it adds the price of
	 * the item to the total.  Otherwise, it calculates the sales tax on the item and puts the sales tax
	 * on the item and adds the item with its sales tax and also to its total.
	 * @param test Item that is passed as an argument to determine if the Item has a sales tax and computes
	 * the value.
	 * @return Returns the final price of the item
	 */
	public double calculate(Item test) {
		double total;
		if(getSalesTax(test) == 0) {
			total = test.getPrice(); 
			totalSale += total;
		}
		else {
			total = (test.getPrice() * test.getQuantity()) * getSalesTax(test);
			double rounded = (Math.ceil(total * 20.0) / 20.0);
			totalSalesTax += rounded;
			total = rounded + test.getPrice();
			totalSale += total;
		}	
		return total;
	}
	
	/**
	 * The printInput method prints out the initial values of each individual item in the Item array.
	 *  
	 * @param test An Item array that is passed to print out the Item's properties respectively:
	 * quantity, item, and price of the item.
	 */
	public void printInput(Item[] test) {
		System.out.println("Input " + inputCounter++);
		for(int i = 0; i < test.length; i++) {
			System.out.printf("%d %s at %.2f %n", test[i].getQuantity(), test[i].getItem(), test[i].getPrice());
		}
		System.out.println();
	}
	
	/**
	 * The printOutput method prints out the final sales of each individual item and the total sales
	 * tax of every item and the total of all items together.  It also sets the totalSale and totalSalesTax
	 * to 0 as a reset for the next basket.
	 * 
	 * @param test Item array that is passed as an argument and then each item's properties are printed
	 * respectively: quantity, item, and the price of the item with its sales tax.
	 */
	public void printOutput(Item[] test) {
		System.out.println("Output " + outputCounter++);
		for(int i = 0; i < test.length; i++) {
			System.out.printf("%d %s: %.2f %n", test[i].getQuantity(), test[i].getItem(), calculate(test[i]));
		}
		System.out.printf("Sales Tax: %.2f %n", totalSalesTax);
		System.out.printf("Total: %.2f %n", totalSale);
		System.out.println();
		totalSale = 0;
		totalSalesTax = 0;
	}
}

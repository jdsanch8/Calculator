/**
 * This class contains an int that can be added, subtracted, multiplied, and divided to.
 * @author Justin Sanchez, PIN# 802
 * @version Feb 19, 2016
 */

package cse360assignment3;

public class Calculator {

	private int total;
	
	/**
	 * Constructor that sets total to be 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the value of the int total
	 * @return the value for total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a value to the total
	 * @param value number being added to total
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts a value from the total
	 * @param value number being subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies a the total by the number
	 * @param value number to be multiplied by
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Divides the total by the number
	 * @param value number to be divided by
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * The previous operations that have been performed
	 * @return String containing previous operations
	 */
	public String getHistory () {
		return "";
	}
}
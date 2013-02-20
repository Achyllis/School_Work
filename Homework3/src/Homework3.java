/*
 * Jordan Stiver
 * 1.31.13
 * Homework3.java 
 * Meal Cost Calculator!
 */

import acm.program.ConsoleProgram;
import java.text.DecimalFormat;
import java.awt.Font;

public class Homework3 extends ConsoleProgram
{
	//define constants
	private static final int APPLET_WIDTH = 400;
	private static final int APPLET_HEIGHT = 300;
	private static final double TAX = 0.08;
	private static final double LOW_TIP = 0.15;
	private static final double HIGH_TIP = 0.18;

	public void init()
	{
		//set the console and font to use
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		setFont(new Font("Courier New", Font.PLAIN, 16));
	}

	public void run()
	{
		//get some values from the user
		String firstName = readLine("First Name: ");
		while (firstName.length() < 2)
		{
			println("That's not your name...");
			firstName = readLine("First Name: ");
		}
		String lastName = readLine("Last Name: ");
		while (lastName.length() < 2)
		{
			println("That's not your name...");
			lastName = readLine("Last Name: ");
		}
		String restaurant = readLine("Restaurant: ");
		
		double price = readDouble("Enter Meal Cost: ");
		while (price <= 0.0)
		{
			println("Nice try.");
			price = readDouble("Enter Meal Cost: ");
		}
		
		//calculate tax into the total
		double tax = (price * TAX);
		
		//define the decimal formatter and print out customer information
		DecimalFormat formatter = new DecimalFormat("0.00$");
		println("First Name: " + firstName);
		println("Last Name: " + lastName);
		println("Restaurant: " + restaurant);
		println("Meal Cost: " + formatter.format(price));
		println();
		println("Welcome " + firstName + " " + lastName + " to " + restaurant);
		println("Meal Cost: " + formatter.format(price));
		println("Tax: " + formatter.format(tax));
		
		//calculate tip
		double tip = 0.0;
		
		if (price <= 10.0)
		{
			tip = price * LOW_TIP;
			println("Tip: " + formatter.format(tip));
		}
		else
		{
			tip = price * HIGH_TIP;
			println("Tip: " + formatter.format(tip));
		}
		
		double total = (price + tax + tip);
		println("Total: " + formatter.format(total));
	}
}

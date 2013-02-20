/*
 * Jordan Stiver
 * 1.24.13
 * PayApplet.java 
 * practice reading values from the console
 */

import acm.program.ConsoleProgram;
import java.text.DecimalFormat;
import java.awt.Font;

public class PayApplet extends ConsoleProgram
{
	private static final int APPLET_WIDTH = 400;
	private static final int APPLET_HEIGHT = 300;	
	
	public void init()
	{
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		setFont(new Font("Courier New", Font.PLAIN, 16));
	}
	
	public void run()
	{
		//get some values from the user
		String name = readLine("Enter your name: ");
		println(name);
		double hours = readDouble("Enter hours worked: ");
		double rate = readDouble("Enter pay rate: ");
		
		//calculate our overtime
		double pay = 0.0;
		if (hours > 40)
		{
			//calc overtime
			pay = ((hours - 40) * 1.5 * rate);
			println(pay);
			
			//calc base pay + overtime
			pay = pay + (40 * rate);
			println(pay);
		}
		else //no overtime here
		{
			pay = hours * rate;
			println(pay);
		}
		
		//declare formatter
		DecimalFormat formatter = new DecimalFormat("0.00$");
		println(name + " worked " + hours + " hours at $" + rate + " per hour.");
		println(name + " earned " + formatter.format(pay));
	}
}

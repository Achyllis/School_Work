/*
 * jordan stiver
 * 1.29.13
 * degreeconverter.java
 * converts celsius to fahreinheit and vise versa
 */

import acm.program.ConsoleProgram;

import java.text.DateFormat;
import java.util.Date;

public class DegreeConverter extends ConsoleProgram
{
	//constants
	private static final int APP_WIDTH = 400;
	private static final int APP_HEIGHT = 300;

	private static final int CELSIUS = 1;
	private static final int FARENHEIT = 2;

	private static final double MIN_CELSIUS = -273.15;
	private static final double MIN_FARENHEIT = -459.67;

	public void init()
	{
		setSize(APP_WIDTH, APP_HEIGHT);
	}

	public void run()
	{
		//run the converter
		convertDegrees();

		//print teh data
		printDate();
	}

	public void convertDegrees()
	{
		int degreeType = readInt("Enter 1 for Celsius, 2 for Farenheit: ");


		double temperature = readDouble("Enter a temperature to convert: ");

		double conversion = 0.0;
		if (degreeType == CELSIUS)
		{
			if (temperature < MIN_CELSIUS)
			{
				println("Where da fuq do you live..");
				return;
			}
			else
			{
				conversion = (9.0 / 5.0) * temperature + 32;
			}
		}
		
		else if (degreeType == FARENHEIT)
		{
			if (temperature < MIN_FARENHEIT)
			{
				println("Where da fuq do you live..");
				return;
			}
			else
			{
				conversion = (5.0 / 9.0) * temperature - 32;
			}
		}
		
		else
		{
			println("You stoopid gimme 1 or 2");
		}

		String typeString = degreeType == CELSIUS ? "Farenheit" : "Celsius";
		println("Result: " + conversion + " " + typeString);
	}

	public void printDate()
	{
		String dateType = readLine("Enter a date format (Short, Medium, Long, or Full): ");
		Date date = new Date(); //today's date

		int type = 0;

		switch (dateType)
		{
			case "Full":
				type = DateFormat.FULL;
				break;

			case "Long":
				type = DateFormat.LONG;
				break;

			case "Medium":
				type = DateFormat.MEDIUM;
				break;

			case "Short":
				type = DateFormat.SHORT;
				break;
			default:
				println("You gave me a wrong date format!");
				return;
		}

		//calls a method that creates the object for us, creates the dateFormat object
		DateFormat dateFormat = DateFormat.getDateInstance(type);

		//format my date
		String dateString = dateFormat.format(date);

		//print my date
		println(dateString);
	}
}

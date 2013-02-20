/*
 * Jordan Stiver
 * 1.31.13
 * Loops.java
 * practicing teh loopz
 */


import acm.program.ConsoleProgram;
import java.awt.Font;

public class Loops extends ConsoleProgram
{
	private static final int APPLET_WIDTH = 500;
	private static final int APPLET_HEIGHT = 500;

	public void init()
	{
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		setFont(new Font("Courier New", Font.BOLD, 22));
	}

	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			println(i);
		}

		for (int i = 0, j = 0; i < 100 && j < 100; i++, j++)
		{
			println("i: " + i + ", j: " + j);
		}

		//uncommon increments
		for (int i = 0; i < 100; i += 2) //even numbers
		{
			println(i);
		}

		for (int i = 0; i < 1000; i *= 2) //power of 2
		{
			println(i);
		}

		for (int i = 100; i >= 0; i--) //counting down
		{
			println(i);
		}

		//infinite for loop
		/*for (;;)
		{

		}*/

		//WHILE LOOPS
		boolean found = false;
		int counter = 0;
		
		while (!found)
		{
			counter++;

			if (counter % 100 == 0)
			{
				println(counter);
				
				pause(100);
			}
		}
		
	}
}

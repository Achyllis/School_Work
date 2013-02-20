/*
 * Jordan Stiver
 * 1.8.12
 * HelloWorld.java
 * This is my first program.
 */

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class HelloWorld extends GraphicsProgram
{
	public void run()
	{
		GLabel myLabel = new GLabel("HelloWorld!", 100, 100);
		add(myLabel);
	}
}

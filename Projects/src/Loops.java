/*
 * Jordan Stiver
 * 1.10.13
 * Loops.java 
 */

import acm.program.GraphicsProgram;
import acm.graphics.GPen;

public class Loops extends GraphicsProgram
{

	public void run() 
	{
		GPen pen = new GPen(0, 10);
		pen.showPen();
		add(pen);
		
		for (int i = 1; i <= 30; i++)
		{
			pen.drawLine(400, 0);
			pen.move(-400, 10);
		}
	}
}

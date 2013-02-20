/*
 * Jordan Stiver
 * 1.8.12
 * GPenPractice.java
 * Practice using the GPen object.
 */

import java.awt.Color;

import acm.program.GraphicsProgram;
import acm.graphics.GPen;
import java.awt.Color;

public class OverlappingSquares extends GraphicsProgram
{
	public void run()
	{
	
		setSize(400, 300);
		
		
		//Create and add my GPen.
		GPen pen = new GPen(250, 150);
		pen.showPen();
		add(pen);
		
		pen.setColor(Color.BLACK);
		pen.setSpeed(0.2);
		pen.setFillColor(Color.YELLOW);
		
		pen.startFilledRegion();
		pen.drawLine(-100, 0);
		pen.drawLine(0, 100);
		pen.drawLine(100, 0);
		pen.drawLine(0, -100);
		pen.endFilledRegion();
		
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.setLocation(300, 100);
		pen.drawLine(-100, 0);
		pen.drawLine(0, 100);
		pen.drawLine(100, 0);
		pen.drawLine(0, -100);
		pen.endFilledRegion();
		
	}	
}

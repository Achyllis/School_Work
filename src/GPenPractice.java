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

public class GPenPractice extends GraphicsProgram
{
	public void run()
	{
	
		setSize(400, 300);
		
		
		//Create and add my GPen.
		GPen pen = new GPen(100, 100);
		pen.showPen();
		add(pen);
		
		pen.setColor(Color.BLACK);
		pen.setFillColor(Color.RED);
		
		pen.startFilledRegion();
		pen.setSpeed(0.2);
		pen.drawLine(100, 0);
		pen.drawLine(0, 100);
		pen.drawLine(-100, 0);
		pen.drawLine(0, -100);
		pen.endFilledRegion();
		
		pen.setFillColor(Color.YELLOW);
		pen.startFilledRegion();
		pen.drawLine(50, -50);
		pen.drawLine(100, 0);
		pen.drawLine(-50, 50);
		pen.endFilledRegion();
		
		pen.setFillColor(Color.GREEN);
		pen.startFilledRegion();
		pen.drawLine(0, 100);
		pen.drawLine(50, -50);
		pen.drawLine(0, -100);
		pen.endFilledRegion();
	}
}
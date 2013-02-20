/*
 * Jordan Stiver
 * 1.15.13
 * FeltBoard.java
 * Practice using other graphical objects
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.Font;

public class FeltBoard extends GraphicsProgram
{
	public void init()
	{
		setSize(800, 600);
		setBackground(Color.BLACK);
	}
		
	public void run()
	{
		//CREATIN SUM LINES
		GLine line = new GLine(100, 100, 600, 400);
		add(line);
		line.setColor(Color.YELLOW);
		
		GLine line2 = new GLine(200, 100, 500, 400);
		add(line2);
		line2.setColor(Color.WHITE);
		
		GRect rect = new GRect(100, 300, 200, 200);
		add(rect);
		rect.setFilled(true);
		rect.setFillColor(Color.BLUE);
		rect.setColor(Color.RED);
		
		GOval ball = new GOval(500, 100, 80, 80);
		add(ball);
		ball.setFilled(true);
		ball.setColor(Color.GREEN);
		
		GOval ball2 = new GOval(100, 300, 600, 200);
		add(ball2);
		ball2.setFilled(true);
		ball2.setColor(Color.GREEN);
		ball2.sendToBack();
		
		GArc wedge = new GArc(400, 400, 150, 150, 35, 280);
		add(wedge);
		wedge.setFilled(true);
		wedge.setColor(Color.YELLOW);
		
		GArc nerp = new GArc(300, 200, 300, 50, 55, 200);
		add(nerp);
		nerp.setFilled(true);
		nerp.setColor(Color.CYAN);
		
		GLabel label = new GLabel("RUN ESCAPE!!!", 400, 100);
		add(label);
		label.setColor(Color.YELLOW);
		
		Font myfont = new Font("Courier New", Font.PLAIN, 50);
		label.setFont(myfont);
		
		GPolygon poly = new GPolygon(700, 500);
		add(poly);
		poly.addVertex(10, 0);
		poly.addVertex(0, 10);
		poly.addVertex(-10, 0);
		poly.addVertex(0, -10);
		poly.setFilled(true);
		poly.setColor(Color.WHITE);
	
	}
}

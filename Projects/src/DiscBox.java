/*
 * Jordan Stiver
 * 1.15.13
 * DiscBox.java
 */

import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GLabel;
import java.awt.Font;

public class DiscBox extends GraphicsProgram
{
	public void init()
	{
		setSize(400, 300);
	}
	
	public void run()
	{
		//first i want to draw my box
		drawBox();
		
		//next, draw my circle
		drawCircle();
		
		//then write the label
		drawSign();
	}

	public void drawBox()
	{
		//Build the side of my box
		GPolygon side = new GPolygon();
		add(side);
		
		side.addVertex(250, 150);
		side.addVertex(250, 250);
		side.addVertex(300, 200);
		side.addVertex(300, 100);
		
		//build the top of my box
		GPolygon top = new GPolygon();
		add(top);
		
		top.addVertex(100, 150);
		top.addVertex(250, 150);
		top.addVertex(300, 100);
		top.addVertex(150, 100);
		
		//build the front of my box
		GRect front = new GRect(100, 150, 150, 100);
		add(front);
		
		front.setFilled(true);
		front.setFillColor(Color.WHITE);
	}

	public void drawCircle()
	{
		GOval circle = new GOval(135, 75, 115, 115);
		add(circle);
		
		circle.setFilled(true);
		circle.sendBackward();
	}

	public void drawSign()
	{
		GLabel sign = new GLabel("Fragile");
		
		//Change my font
		Font myFont = new Font("Courier New", Font.BOLD, 24);
		sign.setFont(myFont);
		add(sign, 120, 190);
		
		//second sign
		GLabel underSign= new GLabel("Handle with care!");
		
		add(underSign, 120, 230);
	}
	
	
}

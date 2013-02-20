/*
 * Jordan Stiver
 * 1.15.13
 * GraphicObjects.java
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class GraphicObjects extends GraphicsProgram
{
	public void init()
	{
		setSize(500, 300);
	setBackground(Color.CYAN);
	}
		
	public void run()
	{
		GPolygon roof = new GPolygon(200, 50);
		add(roof);
		roof.addVertex(-100, 50);
		roof.addVertex(100, 50);
		roof.addVertex(0, 0);
		roof.setFilled(true);
		roof.setFillColor(Color.GREEN);
		
		GRect wall = new GRect(100, 100, 200, 100);
		add(wall);
		wall.setFilled(true);
		wall.setFillColor(Color.GRAY);
		
		GRect lwind = new GRect(120, 120, 40, 40);
		add(lwind);
		lwind.setFilled(true);
		lwind.setFillColor(Color.BLACK);
		
		GRect rwind = new GRect(240, 120, 40, 40);
		add(rwind);
		rwind.setFilled(true);
		rwind.setFillColor(Color.BLACK);
		
		GRect door = new GRect(180, 140, 40, 60);
		add(door);
		door.setFilled(true);
		door.setFillColor(Color.BLUE);
		
		GOval knob = new GOval(205, 170, 10, 10);
		add(knob);
		knob.setFilled(true);
		knob.setFillColor(Color.WHITE);
	}
}

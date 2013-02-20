/*
 * Jordan Stiver
 * 2.7.13
 * Homework4.java
 * Java class that generates Pac-man nomnoming across the screen!
 */

//just a heads up, the cheese is pac-man, and mold is the dots. HUEHUEHUE

import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.GArc;
import acm.graphics.GRect;
import acm.graphics.GOval;

public class Homework4 extends GraphicsProgram
{
	private static final int APP_W = 800;
	private static final int APP_H = 400;
	private static final double MOUTH_ANGLE = 60;
	private static final int START_PM_X = -250;
	private static final int START_PM_Y = 100;
	private static final int START_BB_X = -950;
	private static final int START_BB_Y = 100;

	GArc pacman = new GArc(START_PM_X, START_PM_Y, 200, 200, MOUTH_ANGLE, 240);
	GRect billboard = new GRect(START_BB_X, START_BB_Y, 800, 200);
	

	public void init()
	{
		//initialize the applet
		setSize(APP_W, APP_H);
		setBackground(Color.BLACK);
		
		//install the cheese
		pacman.setColor(Color.YELLOW);
		pacman.setFilled(true);
		pacman.setFillColor(Color.BLACK);
		add(pacman);
		billboard.setColor(Color.BLACK);
		billboard.setFilled(true);
		billboard.setFillColor(Color.BLACK);
		add(billboard);
		billboard.sendBackward();
		
		dots();
	}

	public void dots()
	{
		//puts mold in the cheese's way to accumulate
		for (int i = 1; i <= 8; i++)
		{
			GOval pacdot = new GOval(100 * i, 190, 25, 25);
			pacdot.setColor(Color.YELLOW);
			pacdot.setFilled(true);
			pacdot.setFillColor(Color.BLACK);
			add(pacdot);
			
		}
		billboard.sendToFront();
		pacman.sendToFront();
		
	}

	public void run()
	{
		//eternal loop for eating and regurgitating cheese
		boolean openMouth = false;


		while (true)
		{
			pacman.move(3, 0);
			billboard.move(3, 0);

			double sidePlace = pacman.getX();

			if (sidePlace >= APP_W)
			{
				pacman.setLocation(START_PM_X, START_PM_Y);
				billboard.setLocation(START_BB_X, START_BB_Y);
			}

			if (openMouth == true)
			{
				//if the cheese hasn't been eaten, nom away.
				double currentStartAngle = pacman.getStartAngle();
				currentStartAngle += 5;
				pacman.setStartAngle(currentStartAngle);
				double currentSweep = pacman.getSweepAngle();
				currentSweep -= 10;
				pacman.setSweepAngle(currentSweep);

				if (currentStartAngle >= MOUTH_ANGLE)
				{
					openMouth = false;
				}
			}
			else
			{
				//if the cheese is eaten, regurgitate it gradually.
				double currentStartAngle = pacman.getStartAngle();
				currentStartAngle -= 5;
				pacman.setStartAngle(currentStartAngle);
				double currentSweep = pacman.getSweepAngle();
				currentSweep += 10;
				pacman.setSweepAngle(currentSweep);

				if (currentStartAngle <= 0)
				{
					openMouth = true;
				}
			}
			pause(7);
		}
	}
}
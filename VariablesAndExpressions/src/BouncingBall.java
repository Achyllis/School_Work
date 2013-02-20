/*
 * Jordan Stiver
 * 1.22.13
 * BouncingBall.java
 * get a ball to bounce around the screen
 */


import acm.program.GraphicsProgram;
import acm.graphics.GOval;
import java.awt.Color;

public class BouncingBall extends GraphicsProgram
{
	private static final int APP_WIDTH = 800;
	private static final int APP_HEIGHT = 600;
	private static final int BALL_WIDTH = 150;
	private static final int BALL_HEIGHT = 150;
	
	public void init()
	{
		setSize(APP_WIDTH, APP_HEIGHT);
			
	}
	public void run()
	{
		//center our ball by x and y
		int midX = (APP_WIDTH - BALL_WIDTH) / 2;
		int midY = (APP_HEIGHT - BALL_HEIGHT) / 2;
		
		//create and add our ball
		GOval ball = new GOval (midX, midY, BALL_WIDTH, BALL_HEIGHT);
		add(ball);
		ball.setFilled(true);
		ball.setFillColor(Color.RED);
		
		int directionX = 1;
		int directionY = 1;
		
		//animate our ball
		while (true)
		{
			ball.move(directionX, directionY);
			pause(.000001);
			
			if (ball.getX() + BALL_WIDTH >= APP_WIDTH || ball.getX() <= 0)
			{
				directionX = -directionX;
			}
			if (ball.getY() + BALL_HEIGHT >= APP_HEIGHT || ball.getY() <= 0)
			{
				directionY = -directionY;
			}			
		}
	}	
}

import acm.program.GraphicsProgram;
import acm.graphics.GOval;
import java.awt.Color;

public class AnimationPractice extends GraphicsProgram
{
	public void init()
	{
		setSize(600, 600);
	}
	
	public void run()
	{
		//create a ball
		GOval ball = new GOval(100, 100, 50, 50);
		add(ball);
		ball.setFilled(true);
		ball.setFillColor(Color.RED);
		
		//create another ball
		GOval ball2 = new GOval(250, 250, 75, 75);
		add(ball2);
		ball2.setFilled(true);
		ball2.setFillColor(Color.BLUE);
		
		
		for (int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				ball.setFillColor(Color.GREEN);
			}
			else
			{
				ball.setFillColor(Color.RED);
			}
			pause(500);
		}
		//animate the ball!
		while(true)
		{
			ball.setSize(ball.getWidth() * 1.1, ball.getHeight() + 10);
			pause(50);
			
			ball2.move(-10, -10);
			
			pause(50);
		}
		
		
		
		
	}
	
}

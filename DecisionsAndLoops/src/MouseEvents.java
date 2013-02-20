import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class MouseEvents extends GraphicsProgram
{
	private static final int APP_WIDTH = 800;
	private static final int APP_HEIGHT = 600;
	
	public void init()
	{
		setSize(APP_WIDTH, APP_HEIGHT);
		setBackground(Color.BLACK);
		
		//add mouse listeners
		addMouseListeners();
	}
	
	public void run()
	{
		GOval ball = new GOval(50, 50, 100, 100);
		add(ball);
		ball.setFilled(true);
		ball.setFillColor(Color.YELLOW);
		
		GOval secondBall = new GOval(50, 200, 100, 100);
		add(secondBall);
		secondBall.setFilled(true);
		secondBall.setFillColor(Color.RED);
	}

	public void mouseClicked(MouseEvent event)
	{
		println("x: " + event.getX() + ", y: " + event.getY());
		
		//get the graphics object we clicked on
		GObject clicked = getElementAt(event.getX(), event.getY());
		
		if (clicked != null)
		{
			//i have a GObject now
			if (clicked.getColor() == Color.YELLOW)
			{
				clicked.setColor(Color.BLUE);
			}
			else
			{
				clicked.setColor(Color.YELLOW);
			}			
		}
	}
}

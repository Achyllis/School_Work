import java.awt.Color;
import acm.util.RandomGenerator;
import acm.program.GraphicsProgram;

public class Randomization extends GraphicsProgram
{
	private static final int APPLET_WIDTH = 500;
	private static final int APPLET_HEIGHT = 500;
	private static final int MARGIN = 20;
	
	public void init()
	{
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
	}
	
	public void run()
	{
		RandomGenerator newColor = new RandomGenerator();
		newColor.nextColor();
		
	}
}

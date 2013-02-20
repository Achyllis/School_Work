import acm.program.GraphicsProgram;
import acm.graphics.GOval;
import java.awt.Color;
public class Circles extends GraphicsProgram
{
	public void run()
	{
		setSize(400, 400);
		
		//outermost circle
		circle1();
		
		//white circle
		circle2();
		
		//middle circle
		circle3();
		
	}
		
	
	public void circle1()
	{
		GOval circle1 = new GOval(150, 150, 200, 200);
		add(circle1);
		
		circle1.setFilled(true);
		circle1.setColor(Color.RED);
	}


	public void circle2()
	{
		GOval circle2 = new GOval(190, 190, 120, 120);
		add(circle2);
		
		circle2.setFilled(true);
		circle2.setColor(Color.WHITE);
	}


	public void circle3()
	{
		GOval circle3 = new GOval(230, 230, 40, 40);
		add(circle3);
		
		circle3.setFilled(true);
		circle3.setColor(Color.RED);
	}





}

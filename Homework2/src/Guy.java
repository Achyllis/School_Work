/*
 * Jordan Stiver
 * 1.24.13
 * Homework2.java
 * CREEPA CHASE
 */


import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class Guy extends GraphicsProgram
{
	GCompound guy = new GCompound();
	Creeper bob = new Creeper();

	private static final int APP_WIDTH = 1000;
	private static final int APP_HEIGHT = 800;
	private static final int GUY_WIDTH = 220;
	private static final int GUY_HEIGHT = 410;
	private static final int C_HEIGHT = 410;
	private static final int C_WIDTH = 140;

	public void init()
	{
		//setup applet, put guy together and put both guy and bob into applet
		setSize(1250, 800);
		setBackground(Color.BLACK);
		makeHead();
		makeBody();
		makeLegs();
		add(guy);
		add(bob);
	}

	public void run()
	{
		//generate movement/animation
		int directionX = 1;
		
		int i = 0;

		//animate teh guy
		while (true)
		{
			i++;
			println(i);
			bob.move(directionX, 0);
			pause(10);

			if (bob.getX() + GUY_WIDTH >= APP_WIDTH)
			{
				directionX = -directionX;
			}
			if (bob.getX() <= 0)
			{
				directionX = -directionX;
			}

			//animate bob
			guy.move(directionX + 1, 0);
			pause(10);

			if (guy.getX() + C_WIDTH >= APP_WIDTH)
			{
				directionX = -directionX + 1;
			}
			if (guy.getX() <= 0)
			{
				directionX = -directionX + 1;
			}
			if (i >= 306)
			{
				GLabel boom = new GLabel("GENERIC CREEPER NOISE", guy.getX() + 100, 300);
				GOval blood = new GOval(guy.getX(), 150, 400, 300);
				blood.setFilled(true);
				blood.setColor(Color.RED);
				removeAll();
				add(blood);
				add(boom);
				
				pause(2000);
				removeAll();
				guy = new GCompound();
				makeHead();
				makeBody();
				makeLegs();
				bob = new Creeper();
				add(guy);
				add(bob);
				i=0;
			}
		}
	}
	public void makeHead()
	{
		//make teh head
		GRect head = new GRect(100, 150, 100, 100);
		head.setFilled(true);
		head.setColor(new Color(194, 144, 121));
		GRect hair = new GRect(100, 150, 100, 20);
		hair.setFilled(true);
		hair.setColor(new Color(54, 38, 22));
		GRect leftEye = new GRect(120, 190, 20, 10);
		leftEye.setFilled(true);
		leftEye.setColor(Color.WHITE);
		GRect leftPupil = new GRect(130, 190, 10, 10);
		leftPupil.setFilled(true);
		leftPupil.setColor(new Color(88, 67, 143));
		GRect rightEye = new GRect(160, 190, 20, 10);
		rightEye.setFilled(true);
		rightEye.setColor(Color.WHITE);
		GRect rightPupil = new GRect(160, 190, 10, 10);
		rightPupil.setFilled(true);
		rightPupil.setColor(new Color(88, 67, 143));
		guy.add(head);
		guy.add(hair);
		guy.add(leftEye);
		guy.add(leftPupil);
		guy.add(rightEye);
		guy.add(rightPupil);
	}

	public void makeBody()
	{
		//make teh body
		GRect body = new GRect(40, 240, 220, 160);
		body.setFilled(true);
		body.setColor(new Color(5, 180, 180));
		GLine leftArm = new GLine(100, 300, 100, 400);
		GLine rightArm = new GLine(200, 300, 200, 400);
		GPolygon sword = new GPolygon(60, 360);
		sword.addVertex(0, 0);
		sword.addVertex(10, 10);
		sword.addVertex(-80, 100);
		sword.addVertex(-90, 90);
		sword.setFilled(true);
		sword.setColor(Color.GRAY);
		guy.add(body);
		guy.add(leftArm);
		guy.add(rightArm);
		guy.add(sword);
	}

	public void makeLegs()
	{
		//make teh legs n feet
		GRect legs = new GRect(100, 400, 100, 160);
		legs.setFilled(true);
		legs.setColor(new Color(74, 62, 169));
		GLine crotch = new GLine(150, 450, 150, 560);
		GRect feet = new GRect(100, 30);
		feet.setLocation(new GPoint(100, 530));
		feet.setFilled(true);
		feet.setColor(new Color(110, 110, 110));
		guy.add(legs);
		guy.add(feet);
		guy.add(crotch);
	}
}

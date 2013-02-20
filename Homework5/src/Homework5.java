/*
 * Jordan Stöver
 * 2.18.13
 * Homework5.java
 * This file produces an applet with a bucket to catch fruity rain!
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Homework5 extends GraphicsProgram
{
	//determine the inmate's I.D. numbers (determine constants)
	private static final int
	APP_WIDTH = 450,
	APP_HEIGHT = 500,
	BUCKET_MOVE = 10;

	private static final int 
	ORANGE = 1,
	LIME = 2,
	BANANA = 3;
	private int speed = 5;
	private int score = 0;
	private GPolygon bucket = null;
	private GOval genericFruit = null;
	private GLabel points = null;
	private GLabel endGame = null;

	//BEGIN THE DEATH MARCH (initialize the applet and the bucket)
	public void init()
	{
		addKeyListeners();
		setSize(APP_WIDTH,APP_HEIGHT);
		setBackground(Color.BLACK);
		makeBucket();
		createFruit();
	}

	//MAKE THE INMATES WORK HARDER (start the game when applet is clicked and start
	//								scrolling the fruit.)
	public void run()
	{
		waitForClick();
		moveFruit();
		endGame();
	}

	//Make the inmate's tool for him because he's a lazy bastard
	public void makeBucket()
	{
		bucket = new GPolygon();
		bucket.addVertex(((APP_WIDTH / 2) - 40), 400);
		bucket.addVertex(((APP_WIDTH / 2) + 40), 400);
		bucket.addVertex(((APP_WIDTH / 2) + 25), 475);
		bucket.addVertex(((APP_WIDTH / 2) - 25), 475);
		add(bucket);
		bucket.setFilled(true);
		bucket.setFillColor(Color.GRAY);
	}

	//Tell him to get out of the way when told (move the bucket when arrow keys are pressed.)
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			bucket.move(-BUCKET_MOVE, 0);
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			bucket.move(BUCKET_MOVE, 0);
		}
	}

	//Give him some moldy fruit for his efforts
	public void createFruit()
	{
		RandomGenerator rgen = new RandomGenerator();
		int fruitSpot = rgen.nextInt(1, 300);
		int fruitGen = rgen.nextInt(1,3);

		if (fruitGen == ORANGE)
		{
			genericFruit = new GOval(fruitSpot, -5, 30, 30);
			genericFruit.setFilled(true);
			genericFruit.setColor(Color.ORANGE);
			genericFruit.setFillColor(Color.ORANGE);
			add(genericFruit);			
		}
		else if (fruitGen == LIME)
		{
			genericFruit = new GOval(fruitSpot, -5, 20, 20);
			genericFruit.setFilled(true);
			genericFruit.setColor(Color.GREEN);
			genericFruit.setFillColor(Color.GREEN);
			add(genericFruit);			
		}
		else if (fruitGen == BANANA)
		{
			genericFruit = new GOval(fruitSpot, -5, 10, 60);
			genericFruit.setFilled(true);
			genericFruit.setColor(Color.YELLOW);
			genericFruit.setFillColor(Color.YELLOW);
			add(genericFruit);			
		}
	}
	//BAHAHAHA MAKE HIM WORK FOR HIS MINISCULE FOOD RATIONS
	public void moveFruit()
	{
		if (genericFruit == null) return;

		while(genericFruit.getY() < APP_HEIGHT)
		{
			genericFruit.move(0, speed);
			
			if (bucket.getBounds().intersects(genericFruit.getBounds()))
			{
				remove(genericFruit);
				createFruit();
				score++;
				speed++;
			}
			pause(40);
			
		}
	}
	public void endGame()
	{
		//SCHICKT IHN IN DIE TODESZELLE!!!!
		//SEND HIM TO DEATH ROW!!!!
		remove(bucket);
		Font fancyFont = new Font("Impact", Font.BOLD, 20);
		endGame = new GLabel("GAME OVER");
		endGame.setFont(fancyFont);
		endGame.setColor(Color.RED);
		endGame.setLocation((APP_WIDTH/2) - (endGame.getWidth()/2), (APP_HEIGHT/2) - (endGame.getHeight()/2));
		add(endGame);
		points = new GLabel("FINAL SCORE: " + score);
		points.setFont(fancyFont);
		points.setColor(Color.RED);
		points.setLocation((APP_WIDTH/2) - (points.getWidth()/2), (APP_HEIGHT/2) + 5);
		add(points);
		GImage blood = new GImage("BloodSplatter.png");
		blood.setLocation(0, -30);
		add(blood);
	}
}

/*
 * Jordan Stiver
 * 1.24.13
 * Creeper.java
 * adds the creeper, bob, to the Guy.java file.
 */

import acm.graphics.*;
import java.awt.Color;
import acm.graphics.GCompound;

public class Creeper extends GCompound
{
	public Creeper()
	{
		//put bob together
		makeHead();
		makeBody();
		makeLegs();
	}
	
	private void makeHead()
	{
		//make bob's head
		GRect head = new GRect(400, 140, 100, 100);
		head.setFilled(true);
		head.setColor(new Color(79, 196, 64));
		GRect leftEye = new GRect(420, 160, 20, 20);
		leftEye.setFilled(true);
		leftEye.setColor(Color.BLACK);
		GRect rightEye = new GRect(460, 160, 20, 20);
		rightEye.setFilled(true);
		rightEye.setColor(Color.BLACK);
		GRect topMouth = new GRect(440, 180, 20, 10);
		topMouth.setFilled(true);
		topMouth.setColor(Color.BLACK);
		GRect centerMouth = new GRect(430, 190, 40, 30);
		centerMouth.setFilled(true);
		centerMouth.setColor(Color.BLACK);
		GRect cutOut = new GRect(440, 220, 20, 20);
		cutOut.setFilled(true);
		cutOut.setColor(new Color(79, 196, 64));
		add(head);
		add(leftEye);
		add(rightEye);
		add(topMouth);
		add(centerMouth);
		add(cutOut);
	}
	
	private void makeBody()
	{
		//make bob's body
		GRect body = new GRect(400, 240, 100, 260);
		body.setFilled(true);
		body.setColor(new Color(79, 196, 64));
		GLine neck = new GLine(400, 240, 500, 240);
		add(body);
		add(neck);
	}
	
	private void makeLegs()
	{
		//make bob's stubby legs
		GRect leftLeg = new GRect(380, 480, 40, 80);
		leftLeg.setFilled(true);
		leftLeg.setColor(new Color(79, 196, 64));
		GRect rightLeg = new GRect(480, 480, 40, 80);
		rightLeg.setFilled(true);
		rightLeg.setColor(new Color(79, 196, 64));
		GLine crotch = new GLine(380, 480, 520, 480);
		add(leftLeg);
		add(rightLeg);
		add(crotch);
	}
}

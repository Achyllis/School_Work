/*
 * Jordan Stiver
 * 1.22.13 
 * VariablesPractice.java
 * start working with the console!
 */

import acm.program.ConsoleProgram;

public class VariablesPractice extends ConsoleProgram
{
	public void run()
	{		
		//declare an integer
		int number1, number2; //variable declaration
		number1 = 100;
		number2 = number1/4;
		//declare a double
		double number3 = 0.7;
		double number4 = 1.2, number5 = 1.8;
		
		//float
		float number6 = 100.1f; //dont forget the damn f
		
		//byte, short, long
		byte number7 = 100;
		short number8 = 30000;
		long number9 = 3981219879879879878l; //dont forget the damn l
		
		println(number1);
		println(number2);
		println(number3);
		println(number4);
		println(number5);
		println(number6);
		println(number7);
		println(number8);
		println(number9);
		
		//non-numeric types
		
		//boolean
		boolean trueorFalse = true;
		println(trueorFalse);
		
		//characters
		char myCharacter = 'a';
		char mySecondCharacter = 'b';
		
		myCharacter = mySecondCharacter;
		
		println(myCharacter);
		println(mySecondCharacter);
		
		//strings
		String message = "Hello, World!";
		println(message);
		
		print("A");
		print("B");
		print("C");
		print("D");
		println("E");
		
		double test = 0.0;
		//add 0.1 to test ten times
		for(int i = 0; i < 10; i++) {
			test += 0.1;
		}
		//should output 1, double math sometiem stoopid
		println(test);
	}
}

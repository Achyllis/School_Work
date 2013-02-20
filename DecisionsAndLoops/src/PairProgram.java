/*

 * Jordan and Arianna

 * PairProgram.java

 * This program uses math

 */



import java.text.DateFormat;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class PairProgram extends ConsoleProgram

{
	//constants
    private static final int APPLET_WIDTH = 400;
    private static final int APPLET_HEIGHT = 400;
    private static final int ONE_LOW = -10;
    private static final int ONE_HIGH = 10;
    private static final int TWO_LOW = -100;
    private static final int TWO_HIGH = 100;
    private static final int THREE_LOW = -1000;
    private static final int THREE_HIGH = 1000;

    public void init()

    {
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }

    public void run()
    {
        int difficultyType = readInt("Enter 1 for easy, 2 for medium, 3 for hard: ");
        RandomGenerator number = new RandomGenerator();
        double randomInteger1 = 0.0;
        double randomInteger2 = 0.0;

        if (difficultyType == 1)
        {
            randomInteger1 = number.nextInt(ONE_LOW,ONE_HIGH);
            randomInteger2 = number.nextInt(ONE_LOW,ONE_HIGH);
        }

        if (difficultyType == 2)
        {
            randomInteger1 = number.nextInt(TWO_LOW,TWO_HIGH);
            randomInteger2 = number.nextInt(TWO_LOW,TWO_HIGH);
        }

        if (difficultyType == 3)
        {
            randomInteger1 = number.nextInt(THREE_LOW,THREE_HIGH);
            randomInteger2 = number.nextInt(THREE_LOW,THREE_HIGH);
        }

        String typeString = readLine("Choose +, -, *, or /: ");
       
        double answer = 0.0;

        switch (typeString)
        {
            case "+":
                answer = randomInteger1 + randomInteger2;
                break;

            case "-":
                answer = randomInteger1 - randomInteger2;
                break;

            case "*":
                answer =  randomInteger1 * randomInteger2;
                break;

            case "/":
                answer =  randomInteger1 / randomInteger2;
                break;

            default:
                println("You gave me a wrong operator format.");
                return;

        }
        double userAnswer = readDouble(randomInteger1 + typeString + randomInteger2 + " = ");
        if (userAnswer == answer)
        {
        	println("Yay!!! Correct!");   
        }
        else 
        {
        	println("Awwww, you're wrong!");
        	println(answer);
        }
       
        
    }
}


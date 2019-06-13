/*	Amrit Dahal
 * 	Assignment 3
 * 	CS142 Seattle Central College Sp2019
 *  05/22/2019
 * 
 * This program does the following:
 * 1.	Convert Farehheit to Centigrade
 * 2. Roll two dies and add sum using functions
 * 3. Roll two dies and add sum using class and methods.
 */
import java.util.*;


//create die class
class Die{
	 	
	public int roll() //create roll method 
	{
		//create and return a random number between 0 and 6;
		Random random = new Random();
		return ( random.nextInt(6) + 1 );	
	}
}


// public class main()
public class Project3 {

	// main activity:
	public static void main(String[] args) {
		
		// Temperature Change:
		System.out.print("Temperature Unit Change: \n");
		// TODO Auto-generated method stub
		double centigrade, fahrenheit;
		fahrenheit = 212;
		centigrade = (fahrenheit - 32) * (5.0/9.0);// changed a number to float to make it work
		// output calculated value:
		System.out.print(centigrade + " degrees Centigrade");
		// lines between programs
		System.out.print("\n\n\n");
	
		
		//Random Die Generation
		System.out.print("Random Die Generation: \n");
		Random random = new Random(); //random number creator
		int Die1 = random.nextInt(6) + 1;// plus one as nextInt starts at 0
		int Die2 = random.nextInt(6) + 1;
		// print die values and sum
		System.out.print("Die1 = " + Die1 + "\n");		
		System.out.print("Die2 = " + Die2 + "\n");		
		System.out.print("Sum is = " + (Die1+ Die2) + "\n");
		
		// space between programs
		System.out.print("\n" + "\n");
		
		//Random Die Generation using Die() class and roll() method
		System.out.print("Random Die Generation using Die() class and roll() method: \n");
		Die die1, die2;
		
		//set new class
		die1 = new Die();
		die2 = new Die();
		
		//set value from classes
		int dice1 = die1.roll();
		int dice2 = die2.roll();
		
		//print die values and sum:
		System.out.print("dice1 = " + dice1 + "\n");
		System.out.print("dice2 = " + dice2 + "\n");
		System.out.print("Sum is = " + (dice1+ dice2) + "\n");
	
	}
	
}



package recDice;
import java.util.Random;
/**
 * RecDie Roller
 * @author Jared Rosenberger
 * @version 10/6/22
 * RecDieRoller.java
 * Fall 2022
 */
public class RecDieRoller {
	private Random roller;//roller is used to generate random numbers from 1-6 (inclusive)
	private int rolls;//the number of rolls it takes to roll a two
	
	/**
	 * One argument constructor initializes class variables
	 */
	public RecDieRoller(){
		roller = new Random();
		rolls = 0;
	}//end RecDieRoller
	
	/**
	 * roll simulates rolling a die until a two is rolled
	 * @return the roll (a two)
	 */
	public int roll() {
		int face = roller.nextInt(1, 7);
		rolls++;
		if(face == 2) {
			//System.out.println("You rolled a " + face);
			System.out.println("It took " + rolls + " rolls to roll a 2.");
			return face;
		}
		//System.out.println("You rolled a " + face);
		return roll();	
	}//end roll
	
	/**
	 * @return the number of rolls it took to get a 2
	 */
	public int getRolls() {
		return rolls;
	}//end getRolls
	
	/**
	 * resetRolls sets rolls back to 0
	 */
	public void resetRolls() {
		rolls = 0;
	}//end rolls
}//end RecDieRoller
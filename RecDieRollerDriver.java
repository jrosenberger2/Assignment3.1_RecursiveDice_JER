package recDice;
/**
 * RecDieRollerDriver 
 * @author Jared Rosenberger
 * @version 10/6/22
 * RecDieRollerDriver.java
 * Fall 2022
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		RecDieRoller myDie = new RecDieRoller();
		
		myDie.roll();
		
		int totalRolls = 0;
		double meanRolls = 0.0;
		myDie.resetRolls();
		for(int i=0; i<1000; i++) {
			myDie.roll();
			totalRolls += myDie.getRolls();
			myDie.resetRolls();
		}
		
		meanRolls = (double) totalRolls/1000;
		
		System.out.println("\nYou had " + totalRolls + " total rolls.");
		System.out.println("The average number of rolls it took to get 2 is " + meanRolls);
	}//end main
}//end RecDieRollerDriver
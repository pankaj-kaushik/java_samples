/**
 * 
 */
package classes_objects;

import java.security.SecureRandom;

/**
 * @author pankaj kaushik
 * Date : 11 Oct
 * 
 * Question : You roll two dice. Each die has six faces, which contain one, two, three, four, five and
 * six spots, respectively. After the dice have come to rest, the sum of the spots on the two
 * upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
 * is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
 * sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
 * you must continue rolling the dice until you “make your point” (i.e., roll that same
 * point value). You lose by rolling a 7 before making your point
 */

public class Die {

	private static final SecureRandom randNums = new SecureRandom();
	
	//represent game status
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int SEVEN = 7;
	private static final int ELEVEN = 11;
	private static final int TEWELVE = 12;
	
	public static void main(String[] args) {
		
		int myPoint = 0;
		Status gameStatus;
		int sumofDice = rollDice();
		switch (sumofDice)
		{
		case SEVEN:	//win with 7 on first roll
		case ELEVEN: // win with 11 on first roll
			gameStatus = Status.WON;
			break;
		case TWO:
		case THREE:
		case TEWELVE:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumofDice;
			System.out.println("Point is : " + myPoint);
			break;
				
		}// end switch
		
		while (gameStatus == Status.CONTINUE)
		{
			sumofDice = rollDice();
			
			if (sumofDice == myPoint)
				gameStatus = Status.WON;
			else
				if (sumofDice == SEVEN)
					gameStatus = Status.LOST;
		}// end while
		if (gameStatus == Status.WON)
			System.out.println("Player Wins");
		else
			System.out.println("Player Lose");
	}// end main

	public static int rollDice()
	{
		int die1 = 1 + randNums.nextInt(6);
		int die2 = 1 + randNums.nextInt(6);
		int sum = die1 + die2;
		System.out.println("player rolled " + (die1 + die2));
		return sum;
	}
}

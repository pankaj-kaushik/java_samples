/**
 * 
 */
package operators;

import java.util.Scanner;

/**
 * @author pankaj kaushik
 * Date: 10 Oct, 2018
 *
 */
public class OperatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Numbers");
		num1 = input.nextInt();
		System.out.println("Enter Second Numbers");
		num2 = input.nextInt();
		
		if (num1 == num2)
		System.out.println(num1 + " == " + num2);
		if (num1 < num2)
		System.out.println(num1 + " < " + num2);
		if (num1 > num2)
		System.out.println(num1 + " > " + num2);
		if (num1 != num2)
		System.out.println(num1 + " != " + num2);

	}// end of main

}// end of class


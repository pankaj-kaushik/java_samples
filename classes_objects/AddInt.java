/**
 * 
 */
package classes_objects;

import java.util.Scanner;

/**
 * @author pankaj kaushik
 * Date: 10 Oct, 2018
 *
 */
public class AddInt {

	private static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, sum;
		input = new Scanner(System.in);
		System.out.println("Enter First Numbers");
		num1 = input.nextInt();
		System.out.println("Enter Second Numbers");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.println("Sum = " + sum);

	}// end of main

}// end of class

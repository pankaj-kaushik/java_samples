/**
 * 
 */
package classes_objects;

import java.util.Scanner;

/**
 * @author pankaj
 *
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account myaccount1 = new Account("Neera");
		Account myaccount2 = new Account("Rahul");
		
		myaccount1.setName("Pankaj");
		
		System.out.println("Account1 Name = " + myaccount1.getName());
		System.out.println("Account2 Name = " + myaccount2.getName());

	}

}

/**
 * 
 */
package classes_objects;

/**
 * @author pankaj kaushik
 * Date : 10 oct, 2018
 *
 */
public class Command {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// printing command line arguments
		int length = args.length;
		int counter = 0;
		String cmdArg;
		System.out.println("Number of arguments = " + length);
		while (counter < length)
		{
			cmdArg = args[counter];
			counter = counter + 1;
			System.out.println(cmdArg);
		}
		

	}

}

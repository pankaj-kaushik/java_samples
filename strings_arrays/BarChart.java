/**
 * 
 */
package strings_arrays;

/**
 * @author pankaj
 *
 */
public class BarChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {0, 0, 1, 2, 0, 3, 4, 5, 6, 0, 1};
		System.out.println("Grade Distribution");
		for (int counter = 0; counter < arr.length; counter++)
		{
			if (10 == counter)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			for (int star = 0; star < arr[counter]; star++)
			{
				System.out.print("*");
			}// end inner for loop
			
			System.out.println();
		}

	}

}

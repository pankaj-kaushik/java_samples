/**
 * 
 */
package strings_arrays;

/**
 * @author pankaj
 *
 */
public class ArrayInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = new int[5];
		int [] arr = {1,2,3,4,5};
		System.out.println("Index\t" + "value");
		for (int counter = 0; counter < arr.length; counter++)
		{
			System.out.printf("%d\t%d\n",counter, arr[counter]);
		}
		System.out.println();
		for (int item: arr)
			System.out.print(item);
	}

}

/**
 * 
 */
package classes_objects;

/**
 * @author pankaj
 *
 */
public class StaticCode {

	private static int num = 10;
 	
	public void setData(int item)
	{
		num = item;
	}
	//Instance function can call static & non-static data members.
	public void disp()
	{
		System.out.println("Non static function is called");
		show();
	}
	public static void show()
	{
		System.out.println("static function is called");
	}
	public static void main(String[] args) {
		
			StaticCode sc = new StaticCode();
			show();
			sc.show(); //this is working
			//disp(); // this is an compilation error
			sc.disp();
			sc.setData(50);
			System.out.println(num);
	}

}

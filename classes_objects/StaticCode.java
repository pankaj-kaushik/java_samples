/**
 * 
 */
package classes_objects;

/**
 * @author pankaj
 *
 */
public class StaticCode {

	/**
	 * @param args
	 */
	public void disp()
	{
		System.out.println("Non static function is called");
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
	}

}

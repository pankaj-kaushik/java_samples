/**
 * 
 */
package inheritance;

/**
 * @author pankaj
 *
 */
class B
{
	private int x = 10;
	public void show()
	{
		System.out.print(x);
	}
}
public class A extends B{

	
	public static void main(String[] args) {
		A a = new A();
		a.show();
		//System.out.println(a.x);
		
	}

}

/**
 * 
 */
package classes_objects;

/**
 * @author pankaj
 *
 */

class Sample
{
	protected int x = 20;
	public int y = 10;
}
public class AcessVariable {

	
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.x);
		System.out.println(s.y);

	}

}

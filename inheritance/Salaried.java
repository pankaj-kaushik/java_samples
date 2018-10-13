/**
 * 
 */
package inheritance;

/**
 * @author pankaj
 *
 */
class Employee
{
	private int x = 20;
	public void display()
	{
		System.out.println(x);
	}
}

class Teacher extends Employee
{
	public void print()
	{
		System.out.println("Class Teacher print is called");
	}
	public void display()
	{
		System.out.println("Class Teacher's Display function called");
	}
}
public class Salaried{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Teacher t = new Teacher();
		Employee e = new Teacher();
		e.display();
		//e.print(); // can't be called from employee class
	}

}

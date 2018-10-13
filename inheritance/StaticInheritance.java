package inheritance;

class Vehicle
{
	public static void show()
	{
		System.out.println("show() : static method of class Vehicle");
	}
}

class Car extends Vehicle
{
	public void display()
	{
		System.out.println("display() : static method of class Car");
	}
	public static void show()
	{
		System.out.println("show() : static method of class Car");
	}
}
public class StaticInheritance {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.show();
		Car.show();
		c.display();

	}

}

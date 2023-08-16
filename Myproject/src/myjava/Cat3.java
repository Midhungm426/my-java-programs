package myjava;

public class Cat3 extends Animal3
{
	public void climb()
	{
		System.out.println("Climbs");
	}
	public static void main(String[] args)
	{
	Cat3 obj= new Cat3();
	obj.run();
	obj.climb();
	Dog3 obj2= new Dog3();
	obj2.run();
	obj2.bark();
	}
} 
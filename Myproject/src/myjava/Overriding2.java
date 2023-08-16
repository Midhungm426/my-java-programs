package myjava;

public class Overriding2 extends Overriding1
{
	public void show()
	{
		System.out.println("Hello");
	}
	public static void main (String args[])
	{
		Overriding2 obj= new Overriding2();
		obj.show();
	
	}
}
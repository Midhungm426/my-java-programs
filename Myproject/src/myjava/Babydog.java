package myjava;

public class Babydog extends Dog2
{
public void jumb()
{
	System.out.println("Jumps");
}
	public static void main(String[] args) 
	{
		Babydog obj= new Babydog();
		obj.jumb();
		obj.run();
		obj.eat();
	}

}
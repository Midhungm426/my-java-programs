package myjava;

public class Method2 
{
public void show()
{
	System.out.print("Hai ");
}
public void display()
{
	show();
	System.out.print("Java");
	
}
	public static void main(String[] args) 
	{
		Method2 obj= new Method2();
		obj.display();
	}
}
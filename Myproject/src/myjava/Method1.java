package myjava;

public class Method1
{
int a;
int b;
Method1(int a, int  b)
{
	this.a=a;
	this.b=b;
}
public void show()
{
	System.out.print("Sum = "+(a+b));
}
	public static void main(String[] args) 
	{
		Method1 obj=new Method1(10,15);
		obj.show();
	}
}
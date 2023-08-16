package myjava;

public class Dog extends Animal
{
public void run()
{
	System.out.println("Running");
}
	public static void main(String[] args) 
	{
		Dog obj= new Dog();
		obj.eat();
		obj.run();
	}

}

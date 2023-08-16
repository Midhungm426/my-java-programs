package myjava;

public class SuperCat extends SuperAni
{
public void run()
{
System.out.println("Running");
}
public void climb()
{
super.run();
run();
}
public static void main (String args[])
{
SuperCat obj= new SuperCat();
obj.climb();
}
} 
package myjava;

public class Dogs extends Animals
{
String color ="White";
public void show()
{
System.out.println(color);
System.out.println(super.color);
}
public static void main (String args[])
{
Dogs obj= new Dogs();
obj.show();
}
}
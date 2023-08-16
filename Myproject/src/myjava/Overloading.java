package myjava;

public class Overloading 
{
	public static int sum(int a, int b)
	{
		return (a+b);
	}
	public static int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	public static float sum(float c,float d)
	{
		return(c+d);
	}
	public static void main(String[] args) 
	{
		int sum1= sum(10,20);
		int sum2= sum(10,20,30);
		float sum3= sum(1.1f,2.3f);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
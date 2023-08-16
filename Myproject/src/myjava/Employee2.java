package myjava;

public class Employee2 extends Employee
{
	int salary;
Employee2(int id,String name,int salary)
{
super(id,name);
this.salary=salary;
}
public void show()
{
	System.out.println("Id = "+id);
	System.out.println("Name = "+name);
	System.out.println("Salary = "+salary);
}
public static void main(String args[])
{
	Employee2 obj=new Employee2(1,"Anu",500);
	obj.show();
}
}

package oops;

class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("construcot calling");
	}
	
	Student(int a)
	{
		System.out.println("number is : "+a);
	}
	
	Student(String name)
	{
		System.out.println("My name is : "+name);
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println(id+" "+name);
	}
	
}


public class O002_constructor {
	public static void main(String[] args) {
		
		//Student st1 = new Student();
		//Student st1 = new Student(10);
		//Student st1 = new Student("Darshak");
		
		Student st1 = new Student(10,"Darhsak");
		st1.print();
		
		Student st2 = new Student(20, "Tops");
		st2.print();
		
		
		
	}
}

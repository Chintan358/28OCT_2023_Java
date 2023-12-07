package oops;

class Demo
{
	int id = 20;
	
	public void display()
	{
		int id = 50;
		System.out.println(id);
		System.out.println(this.id);
	}
	
}

public class O003_ThisDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display();
	}
}

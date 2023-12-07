package oops;

class Calc
{
	public void show()
	{
		System.out.println("Runing show method..");
	}
	
	public void getName(String name)
	{
		System.out.println("My name is : "+name);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public int sqare(int a)
	{
		int sq = a*a;	
		return sq;
	}
	
	
	
	public void addArray(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum of array : "+sum);
	}

	public int[] revArray(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public String message()
	{
		return "hello...";
	}
}

public class O005_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.show();
		c.getName("Tops");
		c.add(10, 20);
		c.add(50, 60);
		
		int square =  c.sqare(10);
		int square1 = c.sqare(11);
		System.out.println(c.sqare(50));
		
		String str = c.message();
		System.out.println(str);
		
		
		System.out.println("*****************************");
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {1,2,3,4,5,6};
		c.addArray(a);
		c.addArray(b);
		
	    int k[] = c.revArray(a);
		
	}
}

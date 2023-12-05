package oops;

class Pen
{
	static int price = 10;
	String color = "Red";
	String company = "Cello";
	
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
}

public class O001_FirstDemo {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.price=50;
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		
	}
}

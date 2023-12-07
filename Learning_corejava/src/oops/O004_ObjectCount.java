package oops;

class Obj
{
	
	static int count = 0;
	Obj()
	{
		count++;
		
	}
}

public class O004_ObjectCount {
	public static void main(String[] args) {
		
		Obj o1 = new Obj();
		Obj o2 = new Obj();
		
		
		System.out.println(Obj.count);
		
	 
		
	}
}

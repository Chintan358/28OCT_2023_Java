package basic;

public class B002_datatypes {
	public static void main(String[] args) {
		
//		byte b = -128;
//		short s = 32767;
//		int i = 5656;
//		long l = 5656565l;
//		
//		float f = 265.565656565f;
//		double d = 565.565698989898;
		//System.out.println(f);
		//System.out.println(d);
		
//		char ch = 'a';
//		boolean bool = true;
		
		//it is not data type in java
	//	String str = "hello";
		
//		char c = 83;
//		System.out.println(c);
//		int k = 'S';
//		System.out.println(k);
		
		
		//datatype casting
		
		//widning - implicite
		int i = 52;
		long l = i;
		
		//nerrowing - explicite
		long j = 985;
		int k = (int) j;
		System.out.println(k);
	}
}

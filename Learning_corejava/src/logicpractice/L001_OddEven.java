package logicpractice;

public class L001_OddEven {
	public static void main(String[] args) {
		
		for(int i = 1;i<=100;i++)
		{
			int num = i;
			
			if(num%2 ==0)
			{
				System.out.println(num + " Number is Even");
			}
			else   
			{
				System.out.println(num +" Number is Odd");
			}
		}
		
	}
}

package logicpractice;

public class L002_PrimeNumber {
	public static void main(String[] args) {
		
		for(int j=3;j<=100;j++)
		{
			int num = j;
			int flag = 0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+ ": is prime");
			}
//			else
//			{
//				System.out.println(num+ ": is not prime ");
//			}
		}
		
	}
}

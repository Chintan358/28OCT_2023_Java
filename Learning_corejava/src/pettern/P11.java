package pettern;

public class P11 {
	public static void main(String[] args) {
		
		
		
//		0
//		10
//		010
//		1010
//		01010
		
		
//		1
//		10
//		101
//		1010
		
		int lines = 4;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
		
		
	}
}

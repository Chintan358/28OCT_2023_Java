package statement;

import java.util.Scanner;



public class S005_cal {
	public static void main(String[] args) {

		int choice = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("enter your a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("choice your num \n (1) add \n (2) sub \n (3) multi \n (4) divi \n (0) Exit your choice");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("add is " + (a + b));
			break;
		case 2:
			System.out.println("sub is " + (a - b));
			break;
		case 3:
			System.out.println("multi is " + (a * b));
			break;
		case 4:
			System.out.println("divi is " + (a / b));
			break;
		case  0:
			System.out.println("Exit");
			break;
		default:
			System.out.println("enter your vailid choice");
		}
		}while(choice !=0);

	}
}

package array;

public class A003_ArrayOpration {
	public static void main(String[] args) {
		
		
		
		int a[] = {10,20,6,123,59,63,2,45};
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+(sum/a.length));
		
		System.out.println("******************");
		
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max =a[i];
			}
			
			if(a[i]<min)
			{
				min  =a[i];
			}
		}
		
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);
		
	}
}


import java.util.Scanner;
public class Array1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		int []a=new int[size];
		int sum=0;
		System.out.println("Enter Element");
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++)
		{
			sum=sum + factorial(a[i]);
		}
		System.out.println(sum);
	}
	public static int factorial(int b)
	{
		int fact=1;
		for( int i=b;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	

}

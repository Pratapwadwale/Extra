package Array;
import java.util.Scanner;
//WAJP to find Square of an Array
public class Array2 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		System.out.println("Enter an Element");
		int sum=0;
		//System.out.println("Enter size of Array");
		
		int a []=new int[size];
		for (int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+square(a[i]);
			System.out.println(sum);
		}
		
		System.out.println(sum);
	}
	public static int square(int c)
	{
		int d=1;
		for(int i=0;i<2;i++)
		{
			d=d*c;
		}
		return d;
	}

}

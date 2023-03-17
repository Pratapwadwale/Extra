package Array;
import java.util.Scanner;
public class MaxElement {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)//for min=if(a[i]<min)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}


}

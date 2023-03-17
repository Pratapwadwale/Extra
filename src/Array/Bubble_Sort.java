package Array;
import java.util.Scanner;
public class Bubble_Sort {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])//for descending order  if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}

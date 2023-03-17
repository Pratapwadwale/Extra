package Array;
import java.util.Scanner;

public class Binary_Search {
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of an Array");
		int size=s.nextInt();
		int []a=new int [size];
		System.out.println("Enter the element of an Array in acending order");
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element to be search");
		int ele=s.nextInt();
		int min=0;
		int max=a.length-1;
		int mean=(min+max)/2;
		while(min<=max)
		{
			if (ele==a[mean])
			{
				System.out.println(mean);
				break;
			}
			else if(a[mean]<ele)
			{
				min=mean+1;
			}
			else
			{
				max=mean-1;
			}
			mean=(min+max)/2;
		}
		if(min>max)
		{
			System.out.println("Element is not found");
		}
	}

}

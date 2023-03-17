package Array;
import java.util.Scanner;
//WAJP to find Square rout of an Array
public class ArraySS {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size af an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Element of an Arra");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a[0]);
		for (int i=0;i<size;i++)
		{
			System.out.println(squre(a[i]));
		}
	}
	public static int squre(int num)
	{
		int i;
		for( i=0;i<num;i++)
		{
			if(i*i==num)
			{
				return i;
			}
		}
		return -1;
	}

}

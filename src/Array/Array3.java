package Array;

import java.util.Scanner;
//WAJP to find the cube of an Array
public class Array3 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of Array");
		
		int size=sc.nextInt();
		int []a=new int[size];
		int sum=0;
		System.out.println("Enter an Element of an array");
		for(int c=0;c<size;c++)
		{
			a[c]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++)
		{
			sum=sum+cube(a[i]);
		}
		System.out.println(sum);
	}
	public static int cube(int num)
	{
		int cube=1;
		
		for(int i=1;i<=3;i++)
		{
			cube=cube*num;
		}
		return cube;
	}
}

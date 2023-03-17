package practice;

import java.util.Scanner;
public class Class_Array {
	public static void main (String []args)
	{
		int [] marks=new int [5];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			int a=sc.nextInt();
			marks[i]=a;
		}
		for (int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println(marks[3]);
		
		
	}

}

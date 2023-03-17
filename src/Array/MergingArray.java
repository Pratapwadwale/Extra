package Array;
//WAJP TO Merging of Array in Zig_Zag Way
import java.util.Scanner;
public class MergingArray {
	
	public static void main(String [] args)
	{
		Scanner sa=new Scanner (System.in);
		System.out.println("Enter the Size of First Array");
		int size1=sa.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter the Size of an Second Array");
		int size2=sa.nextInt();
		int b[]=new int[size2];
		System.out.println("Enter the Element of an first Array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sa.nextInt();
		}
		System.out.println("Enter The Element of an Second Array");
		for (int i=0;i<b.length;i++)
		{
			b[i]=sa.nextInt();
		}
		int p=0;
		int k=0;
		int c[]=new int[a.length+b.length];
		for (int i=0;i<a.length+b.length;i++)
		{
			if (i%2==0)
			{
			 c[i]=a[k++];
			 System.out.println(k);
			}
			else 
			{
				c[i]=b[p++];
			}
			
		}
		for (int i=0;i<a.length+b.length;i++)
		{ 
			System.out.println(c[i]);
		}
	}
		
		
}



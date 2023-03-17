package Array;
//WAJP for merging two Arrays
import java.util.Scanner;
public class Array4 {
	public static void main(String [] args)
	{
		Scanner sa=new Scanner (System.in);
		System.out.println("Enter the size of first Array");
		int size1=sa.nextInt();
		int [] a=new int[size1];
		System.out.println("Enter size of an Second Array");
		int size2=sa.nextInt();
		int b[]=new int [size2];
		System.out.println("Enter the Element of Fist Array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sa.nextInt();
		}
		System.out.println("Enter the Element of Second Array");
		for (int i=0;i<b.length;i++)
		{
			b[i]=sa.nextInt();
		}
		System.out.println("Merging of two Array");
		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length+b.length;i++)
		{
			if (i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[j++];
			}
		}
		for (int i=0;i<a.length+b.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
	
	

}

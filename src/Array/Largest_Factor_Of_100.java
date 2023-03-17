package Array;
import java.util.Scanner;
public class Largest_Factor_Of_100 {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an aaray");
		int size=s.nextInt();
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int i;
		for(i=0;i<a.length-1;i++)
		{
		  if ((100%a[i]==0)&&(a[i]<a[i+1])&&(100%a[i+1]==0))
		  {
			 
		  }
		  else 
		  {
			  int temp=a[i];
				 a[i]=a[i+1];
				 a[i+1]=temp;

		  }
		 
		}
		System.out.println(a[i]);
		for (int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
	

}

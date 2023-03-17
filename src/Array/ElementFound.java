package Array;
import java.util.Scanner;

public class ElementFound {
	public static void main(String []args)
	{
		Scanner as=new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size=as.nextInt();
		int [] a=new int[size];
		System.out.println("Enter Element of an Array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=as.nextInt();
		}
		System.out.println("Enter the Element to be check");
		int c=as.nextInt();
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==c)
			{
				count++;
				//System.out.println(a[i]+":is present in Array");
				
			}
		}
		System.out.println(count);
		
		
	}
	

}

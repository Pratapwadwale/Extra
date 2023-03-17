package Array;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter first number");
		int b=s.nextInt();
		System.out.println("Enter second Number");
		int c=s.nextInt();
		System.out.println("Enter the Element of an Array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%b==0&&a[i]<c)
			{
				int rem=c-a[i];
				a[i]+=rem;
			}
			else if(a[i]%b==0&&a[i]>c)
			{
				int rem=a[i]%c;
				rem=c-rem;
				a[i]+=rem;
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}

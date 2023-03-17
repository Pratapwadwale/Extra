package Array;
import java.util.Scanner;
public class Dishes {
	public static void main (String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//int a=s.nextInt();
		String b[]=new String[2];
		for (int i=0;i<b.length;i++)
		{
			b[i]=s.next();
		}
		 String d=s.next();
		for (int i=0;i<b.length;i++)
		{
				System.out.println(b[i]);
		}
		
	}
  

}

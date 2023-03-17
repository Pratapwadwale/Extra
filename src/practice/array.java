package practice;

import java.util.Scanner;
public class array {
	public static void main (String []args)
	{
	  int [] marks =new int [6];
	
	 for (int i=0;i<marks.length;i++)
	 {
		Scanner s=new Scanner (System.in);
		marks[i]=s.nextInt();
	 }
	 for (int j=0;j<marks.length;j++)
	 {
		 System.out.println(marks[j]);
	 }
    }

}

package string;

public class AsciValueOfSpecialChar {
   public static void main(String [] args)
   {
	   String s="@#ASD!@";
	   for (int i=0;i<s.length();i++)
	   {
		   if((int)s.charAt(i)<65||(int)s.charAt(i)>90)
		   {
			   System.out.println((int)s.charAt(i));
		   }
	   }
   }
}	
															
package string;

public class XX {
	
		   public static void main(String args[])  {   
		      int flag = 0; 
		      int count = 0;  
		      int i = 0; 
		      String str = "The sunset is beautiful 189";

		      while (i < str.length()) { 
		         if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
		               flag = 0; 
		         }else if (flag == 0) { 
		        	 
		            flag = 1; 
		            count++; 
		         } 
		         i++;
		      } 
		      System.out.println("The string is: " + str);
		      System.out.println("No of words in the above string are: " + count); 
		   } 

}

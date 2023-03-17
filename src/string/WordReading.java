package string;
import java.io.*;
import java.util.*;
public class WordReading {
	

	
	    void main()throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("ENTER A STRING ");
	        String str = br.readLine();
	        str= str.toLowerCase();
	        int c=0;
	        Scanner sc = new Scanner(str);
	        while(sc.hasNext())
	        {
	            sc.next();
	            c++;
	        }
	        System.out.println("NO.OF WORDS = "+c);
	    }
	
}

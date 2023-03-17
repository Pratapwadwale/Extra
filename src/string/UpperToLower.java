package string;

public class UpperToLower {
    public static void main(String []args)
    {
    	String s="ABCD";
    	String lower="";
    	for(int i=0;i<s.length();i++)
    	{
    		//int a=(int)(s.charAt(i)+32);
    		lower=lower+(char)(s.charAt(i)+32);
    		
    	}
    	System.out.println(lower);
    }
}

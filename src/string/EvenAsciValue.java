package string;

public class EvenAsciValue {
	public static void main(String [] args)
	{
		String s="ABCD";
		for(int i=0;i<s.length();i++)
		{
			//int a=(int);
			if(s.charAt(i)%2==0)
			{
				System.out.println((int)s.charAt(i));
			}
		}
	}

}

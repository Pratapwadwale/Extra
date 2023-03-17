package string;

public class SumOfAsciValue {
	public static void main(String []args)
	{
		String s="ABCD";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum+=(int)s.charAt(i);
		}
		System.out.println(sum);
	}

}

package string;

public class Immutable {
	public static void main(String [] qrgs)
	{
		String s="Qspider";
		String s1="Deccan";
		System.out.println(s);
		System.out.println(s.hashCode());
		s=s+s1;
		System.out.println(s);
		System.out.println(s.hashCode());
	}

}

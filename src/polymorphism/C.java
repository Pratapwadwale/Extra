package polymorphism;

public class C {
	public static void main(String []args)
	{
		A d=new B();
		A s=new B();
		
		System.out.println(d.a);
		System.out.println(d.s);
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.hashCode());
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		
	}

}

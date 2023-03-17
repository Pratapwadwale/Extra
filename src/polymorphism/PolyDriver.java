package polymorphism;

public class PolyDriver {
	public static void main(String []args)
	{
		Poly1 a=new Poly2();
		a.a();
		a.c();
		System.out.println(a.a);
		System.out.println(a.b);
		
	}

}

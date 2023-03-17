package polymorphism;

public class To_String_Driver {
	public static void main(String []args)
	{
		To_String s=new To_String("Pratap","Civil","MPGISOE",98989);
		s.x();
		System.out.println(s.hashCode());
		To_String s1=new To_String("Pratap","Civil","MPGISOE",9898);
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s.toString()+"=="+s1.toString());
		System.out.println(s.toString());
		System.out.println(s1.toString());
	}

}

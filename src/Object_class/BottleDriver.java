package Object_class;

public class BottleDriver {
	public static void main(String []args)
	{
		Bottle b=new Bottle("milton","Green","Glass",500.0,200.0);
		System.out.println(b);
		System.out.println(b.toString()); //To give our reference we use toString 
		Bottle b1=new Bottle("milton","Green","Glass",500.0,200.0);
		
		
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b==b1);
		
	}

}

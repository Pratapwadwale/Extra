package Lazy_Instanciation;

public class Engine {
	String type;
	double price;
	double cc;
	
	Engine () {}
	Engine (String type,double price,double cc)
	{
		this.type=type;
		this.price=price;
		this.cc=cc;
	}
	public void displayEngine()
	{
		System.out.println(type);
		System.out.println(price);
		System.out.println(cc);
	
	}

}

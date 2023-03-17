package Earlay_instanciation;

public class Engine {
	
	String type;
	int  cc;
	int price;
	int power;
	
	Engine () {}
	
	Engine (String type, int cc,int price,int power)
	{
		this.type=type;
		this.cc=cc;
		this.price=price;
		this.power=power;
	}
	public void displayEngine()
	{
		System.out.println(type);
		System.out.println(cc);
		System.out.println(price);
		System.out.println(power);
	}

}

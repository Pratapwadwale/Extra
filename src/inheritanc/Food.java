package inheritanc;

public class Food {
	
	String taste;
    double price;
	Food()
	{}
	protected Food (String taste,double price)
	{
		this.taste=taste;
		this.price=price;
	}
	public void displayFood()
	{
		System.out.println(taste);
		System.out.println(price);
	}
}

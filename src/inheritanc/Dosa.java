package inheritanc;

public class Dosa extends Food{
	String shape;
	String type;
	Dosa (){}
	Dosa (String taste,double price,String shape,String type)
	{
		super( taste, price);
		this.shape=shape;
		this.type=type;
	}
	public void displayDosa()
	{
		displayFood();
		System.out.println(shape);
		System.out.println(type);
	}
}

package Lazy_Instanciation;

public class Car {

	String brand;
	String name;
	String type;
	int price;
	int seats;
	Engine e;
	Car () {}
	Car (String brand,String name,String type,int price,int seats)
	{
		this.brand=brand;
		this.name=name;
		this.type=type;
		this.price=price;
		this.seats=seats;
		
	}
	public void displayCar()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(seats);
	}
	public void insertEngine(String type,double price,double cc )
	{
		  e = new Engine( type, price,cc);
		
	}
	
}

package Earlay_instanciation;

public class Car {
	String brand;
	String type;
	String name;
	int seats;
	Engine e=new Engine("petrol",250,200000,4);
	
	Car () {}
	Car (String brand,String type, String name, int seats)
	{
		this.brand=brand;
		this.type=type;
		this.name=name;
		this.seats=seats;
	}
	public void displayCar()
	{
		e.displayEngine();
		System.out.println(brand);
		System.out.println(type);
		System.out.println(name);
		System.out.println(seats);
		
	}

}
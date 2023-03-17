package Lazy_Instanciation;

public class CarDriver {
	
	public static void main(String []args)
	{
		Car c=new Car("TATA","I20","SPORTS",2000000,7);
		c.displayCar();
		c.insertEngine("PETROL",200000.0,800);
		c.e.displayEngine();

	}

}

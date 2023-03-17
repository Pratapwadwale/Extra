package Object_class;

public class Bottle {
	String brand;
	String colour;
	String material;
	double cap;
	double price;
	Bottle () {}
	Bottle (String brand,String colour,String material,double capacity,double price) 
	{
		this.brand=brand;
		this.colour=colour;
		this.material=material;
		cap=capacity;
		this.price=price;
	}
	public String toString()
	{
		return "[brand: "+brand+"]";
	}
	
	public boolean equals(Object ref)
	{
		Bottle s=(Bottle)ref;//Down casting reference
		if(this.brand==s.brand && this.price==s.price && this.colour==s.colour && this.material==s.material && this.cap==s.cap)
		{
			return true;
		}
		
		return false;
	}
	public int hashCode()
	{
		int hc=0;
		hc+=price;
		hc+=cap;
		return hc;
	}

}

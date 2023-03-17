package inheritanc;

public class University {
	String name;
	String location;
	
	University() {}
	University (String name,String location) 
	{
		this.name=name;
		this.location=location;
	
	}
	public void displayUniversity()
	{
		System.out.println(name);
		System.out.println(location);
	
		
	}
}

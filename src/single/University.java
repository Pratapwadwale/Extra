package single;

public class University {
	String name;
	//int id;
	String location;
	
	University () {}
	
	University (String name,int id,String location) 
	{
		this.name=name;
		//this.id=id;
		this.location=location;
		
	}
	public  void displayUniversity()
	{
		System.out.println(name);
		//System.out.println(id);
		System.out.println(location);
	}


}

package inheritanc;

public class College extends University {

	String nam;
	String place;
	int id;
	
	College () {}
	
	College (String name,String location,String nam,String place,int id)
	{
		this.name=name;
		//this.code=code;
		this.location=location;
		
		this.nam=nam;
		this.place=place;
		this.id=id;
		
	}
	public void displayCollege()
	{
		displayUniversity();
		System.out.println(nam);
		System.out.println(place);
		System.out.println(id);
	}
}

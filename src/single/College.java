package single;

public class College extends University {
	String cname;
	int id;
	String place;
	
	
	College () {}
	
	College (String name, String location,String cname,int id ,String place)
	{
		this.name=name;
		this.location=location;
		
		this.cname=cname;
		this.id=id;
		this.place=place;
	}
	public void displayCollege()
	{
		displayUniversity();
		System.out.println(cname);
		System.out.println(id);
		System.out.println(place);
	}

}

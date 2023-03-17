package inheritanc;

public class Branch extends College {

	String branchname;
	String hod;
	int student;
	
	Branch () {}
	Branch (String name,String location,String nam,String place,int id,String branchname,
			String hod,int student)
	{
		this.name=name;
		//this.code=code;
		this.location=location;
		
		this.nam=nam;
		this.place=place;
		this.id=id;
		
		this.branchname=branchname;
		this.hod=hod;
		this.student=student;
		
	}
	public void displayBranch()
	{
		displayCollege();
		System.out.println(branchname);
		System.out.println(hod);
		System.out.println(student);
	}
}

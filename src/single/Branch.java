package single;

public class Branch extends College {
	
	String bname;
	String hod;
	int nos;
	int nol;
	Branch() {}
	
	Branch (String name, String location,String cname,int id ,String place,String bname,String hod,int nos,int nol)
	{
		this.name=name;
		this.location=location;
		this.cname=cname;
		this.id=id;
		this.place=place;
		this.bname=bname;
		this.hod=hod;
		this.nos=nos;
		this.nol=nol;
	}
	public void displayBranch()
	{
	
		displayCollege();
		
		System.out.println(bname);
		System.out.println(hod);
		System.out.println(nos);
		System.out.println(nol);
	}

}

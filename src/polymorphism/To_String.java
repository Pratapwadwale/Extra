package polymorphism;

public class To_String {
	String name;
	String branch;
	String college;
	int mobile;
	To_String(){}
	To_String(String name,String branch,String college,int mobile)
	{
		this.name=name;
		this.branch=branch;
		this.college=college;
		this.mobile=mobile;
		
	}
	public void x()
	{
		System.out.println(name);
		System.out.println(branch);
		System.out.println(college);
		System.out.println(mobile);
	}
	public int hashCode()
	{
		int a=mobile;
		return a;
	}
	public boolean equals(Object ref)
	{
		To_String s=(To_String)ref;
		if(this.name==s.name&&
		this.branch==s.branch&&
		this.college==s.college&&
		this.mobile==s.mobile)
		{
		return true;
		}
		return false;
	}
	
	

}

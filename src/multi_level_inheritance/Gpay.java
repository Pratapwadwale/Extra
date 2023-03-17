package multi_level_inheritance;

public class Gpay extends UPI{
	String reward;
	int gpin;
	String gpayid;
	Gpay() {}
	Gpay(String name,long phono,long accno,int pin,String reward,int gpin,String gpayid)
	{
		this.name=name;
		this.phono=phono;
		this.accno=accno;
		this.pin=pin;
		this.reward=reward;
		this.gpin=gpin;
		this.gpayid=gpayid;
		
	}
	public void displayGpay()
	{
		displayUPI();
		System.out.println(reward);
		System.out.println(gpin);
		System.out.println(gpayid);
	}

}

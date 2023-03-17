package multi_level_inheritance;

public class UPI {
	String name;
	int pin;
	long phono;
	long accno;
	UPI () {}
	UPI (String name,int pin,long phono,long accno) 
	{
		this.name=name;
		this.pin=pin;
		this.phono=phono;
		this.accno=accno;
	}
	public void displayUPI()
	{
		System.out.println(name);
		System.out.println(pin);
		System.out.println(phono);
		System.out.println(accno);
	}

}

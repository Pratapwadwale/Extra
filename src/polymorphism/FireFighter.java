package polymorphism;

public class FireFighter {
	int bullet=6;
	public static void run()
	{
		System.out.println("Start runing");//method shadowing
	}
	public void fireBullet()//method overriding
	{
		bullet-=1;
		
	}
	public void reload()
	{
		bullet=6;
		//System.out.println("Reload Successfully");
	}
	public void takeRight()//method overriding
	{
		System.out.println("Take Circle");
	}
	public void takeLeft()
	{
		System.out.println("System.out.println");
	}

}

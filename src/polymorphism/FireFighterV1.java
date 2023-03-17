package polymorphism;

public class FireFighterV1 extends FireFighter{
	public static void run()
	{
		System.out.println("Stop");
	}
	public void takeRight()
	{
		System.out.println("Take Right");
	}
	public void fireBullet()
	{
		bullet-=1;
		System.out.println(bullet);
	}


}

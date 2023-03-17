package polymorphism;

public class FireFighterDriver {
	public static void main(String []args)
	{
	FireFighter f=new FireFighterV1();
	f.takeRight();
	f.fireBullet();
	f.fireBullet();
	f.reload();
	f.fireBullet();
	f.run();
	}


}

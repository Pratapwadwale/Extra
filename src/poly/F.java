package poly;

public class F {
	int bullet=6;
	public void goStraight()
	{
		System.out.println("Go Straight");
	}
	public void fireBullet()
	{
		bullet-=1;
		
	}
	public void reload()
	{
		bullet=6;
		//System.out.println("Reload Succefully");
	}
	public void takeRight()
	{
		System.out.println("Take Circle");
	}
	public void takeLeft()
	{
		System.out.println("take left");
	}

}

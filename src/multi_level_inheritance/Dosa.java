package multi_level_inheritance;
import inheritanc.*;

public class Dosa extends Food {

	String shape;
	String type;
	
	Dosa (String taste,double price,String shape,String type)
	{
		super( taste, price);
		this.shape=shape;
		this.type=type;
		
	}
}

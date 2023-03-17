package string;//String is object//

public class s {
	public static void main(String [] args)
	{
		String s=new String("String");    //the object is created in heap areas //different object is created
		String s1=new String("String");  //the object is created in heap areas //different object is created
		String a="Hello";               //the object is created in String pool areas //string pool areas is the core area of heap
		String a1="Hello";             //the object is created in String pool areas //string pool areas is the core area of heap
		System.out.println(s==s1);
		System.out.println(a==a1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a.equals(a1));      //the equals method of object class is overridden
		System.out.println(s.equals(s1));      //the equals method of object class is overridden
		System.out.println(s.hashCode());      //the hashCode method of object class is overridden
		System.out.println(s1.hashCode());     //the hashCode method of object class is overridden
		System.out.println(a.hashCode());;     //the hashCode method of object class is overridden
		System.out.println(a1.hashCode());;    //the hashCode method of object class is overridden
	}

}

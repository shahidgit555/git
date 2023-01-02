package oops;



//public class CreateObject 
//{
//	int a = 10;
//	
//	public static void main(String[] args)
//	{
//		CreateObject c = new CreateObject();
//		System.out.println(c.a);
//		
//	}
//
//}


////////

public class CreateObject 
{
	int age ;
	String name;
	
	void details()
	{
		System.out.println(age+" "+name);
	}
	
	public static void main(String[] args)
	{
		CreateObject c = new CreateObject();
		c.age  =10;
		c.name ="shahid";
		c.details();
		System.out.println("thankyou ");
		
		
	}
}
package oops;

class animal
{
	void cat()
	{
		System.out.println("cat is so cute");
	}
}
class fruits extends animal
{
	void mango()
	{
		System.out.println("mango is everyone fav");
	}
}

class car extends fruits
{
	void swift()
	{
		System.out.println("swift car");
	}
}

public class multileve_inhe 
{
  public static void main(String[] args) 
	{
	  animal a = new animal();
	  a.cat();
	  
	  System.out.println("-----------------");
	  
	  fruits f = new fruits();
	  f.cat();
	  f.mango();
	  
	  System.out.println("-----------------");
	  
	  car c = new car();
	  c.cat();
	  c.mango();
	  c.swift();
	 
	  
		
	}

}

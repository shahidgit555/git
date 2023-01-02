package oops;

class teacher
{
	void deepak_sir()
	{
		System.out.println("deepak sir is best one");
	}
}
class mobile extends teacher
{
	void iphone()
	{
		System.out.println("iphone is best mobile company");
	}
}
class color extends teacher
{
	void black()
	{
		System.out.println("black color is my fav");
	}
}
public class hierarcal_ine
{
	public static void main(String[] args) 
	{
		teacher t = new teacher();
		t.deepak_sir();
		
		System.out.println("-----------------");
		
		mobile m = new mobile();
		m.deepak_sir();
		m.iphone();
		
		System.out.println("-----------------");
		 
		color c = new color();
		c.deepak_sir();
		c.black();
	}

}

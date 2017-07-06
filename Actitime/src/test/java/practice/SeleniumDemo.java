package practice;

  class Basya
	{
		 void basya()
		{
			System.out.println("Basya");
		}
	}


  public class SeleniumDemo extends Basya{
public void basya()
	{
		System.out.println("Overriding");
		
	}
	
	void basya1()
	{
		
	}
	
	public static void main(String[] args) {
		Basya d = new SeleniumDemo();
		d.basya();
	
		Basya n = new Basya();
		
		n.basya();
		
	}
	
}

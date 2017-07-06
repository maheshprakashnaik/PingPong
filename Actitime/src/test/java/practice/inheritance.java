package practice;

class abc
{
	int i = 100;
	static int j = 200;
	private int k = 300;
	void print()
	{
		System.out.println("i="+i);
		
	}
	
	abc(int c)
	{
		System.out.println(c);
	}
	static void disp()
	{
		System.out.println("j="+j);
		
	}
	
}

class Z extends abc
{
	Z()
	{
	super(30);
	}
}

public class inheritance {

	public static void main(String[] args) 
	{
		Z b1 = new Z();
		System.out.println(b1.j);
		Z b2 =new Z();
		b2.disp();
		b1.print();
		abc a1 = new abc(20);
		a1.print();
		
		

	}

}

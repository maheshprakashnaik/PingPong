package practice;


class o 
{
	
}
class B extends o
{
	int i,j;
	B()
	{
		this(100,200);
		
	}
	
	private B(int i, int j)
	{
		super();
		this.i = i;
		this.j = j;
		
	}
	
	void disp()
	{
		this.print();
	}
	
	void print()
	{
		System.out.println("print() method");
		
	}
	
	
}

public class Demo_ts_su
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a1 = new B();
		System.out.println("i = "+a1.i+ "j = "+a1.j);
		a1.disp();

	}

}

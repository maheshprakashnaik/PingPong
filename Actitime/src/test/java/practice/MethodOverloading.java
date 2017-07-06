package practice;


class mahesh
{
 int i;
 int j;
 int getVal(int a)
 {
	 i =a;
	 return i;
 }
}

class mahesh2
{
	 void heat(String feeling)
	{
		System.out.println("its"+feeling);
	}
	
	 protected void heat(int degrees,int percent)
	{
		System.out.println("heating degree is "+degrees);
		System.out.println("and the percent of heat is "+percent);
	}
}

class mahesh3 extends mahesh2
{
	public void heat(String feeling,String threat) 
	{
		super.heat("m2's feeling");
		System.out.println("its"+feeling);
		System.out.println("its"+threat);
	}
}

public class MethodOverloading extends mahesh2
{
    public static void main (String args [])
    {
        mahesh3 m3 = new mahesh3();
        m3.heat(" so hot", " burns the skin");
        
        mahesh2 m2 = new mahesh2();
        m2.heat(40, 60);

        mahesh m = new mahesh();
        System.out.println(m.i);
    }
}
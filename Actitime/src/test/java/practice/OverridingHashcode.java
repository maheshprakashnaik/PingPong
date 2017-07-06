package practice;

class Orange
{
	int wt;
	Orange(int wt)
	{
		this.wt = wt;
	}
	
	public String toString()
	{
		return "wt = " +wt;
		
	}

	/*public boolean equals(Object o)
	{
		if(o==null)
			return false;
		if(this == o)
			return true;
		if(this.wt==((Orange)o).wt)
			return true;
		
			return false;
		
}*/
}
public class OverridingHashcode {

	public static void main(String[] args) {
		
		Orange o = new Orange(100);
		System.out.println(o);
		
		Orange o1 = o;                                                                                                     
		
		
		System.out.println(o==o1);
		
		
		// TODO Auto-generated method stub

	}

}

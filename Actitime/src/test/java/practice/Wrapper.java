package practice;

 class Tiger
 {
	
 }
 public class Wrapper extends Tiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1 = new Tiger();
		
		Integer in = new Integer(500);
		Class type = in.getClass();
		System.out.println(type.getName());
		System.out.println(in.intValue());
		long  l =100;          
		Byte bb = new Byte((byte)l);
		System.out.println(bb.byteValue());
		
		System.out.println(t1);
		
		 Class cls = t1.getClass();
		 System.out.println(cls.getName()+"@"+Integer.toHexString(t1.hashCode()));

	}

 }

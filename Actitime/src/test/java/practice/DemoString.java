package practice;

public class DemoString {

	public static void main(String[] args) {
		
		String s1 = "hello";
		System.out.println(s1.length());
		
		System.out.println(s1= s1.concat("world"));
		String s2 = "";
		System.out.println(s2.length());
		String s3 = new String();
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
		System.out.println(s3 = s3.concat("bangalore"));
		System.out.println(s3.isEmpty());
		System.out.println(s1.equals("hellowor"));
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.indexOf("or"));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.replace('e','a'));
		System.out.println(s1.charAt(s1.length()-1));
		
		for (int i=0;i<s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		for (int j = s1.length()-1;j>=0;j--)
		{
			System.out.print(s1.charAt(j));
			System.out.print("--------");
			
		}
		
		
		String s = new StringBuffer(s1).reverse().toString();
		System.out.println("\n"+s);
	}

}

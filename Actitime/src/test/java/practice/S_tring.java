package practice;

public class S_tring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java";
		String s2 = new String("Development");
		String s3 = "java";
		String s4 = new String("java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s2==s4);
		
		

	}

}

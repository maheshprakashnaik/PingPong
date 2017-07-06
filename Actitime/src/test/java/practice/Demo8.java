package practice;

public class Demo8 {

	
	static Demo8 getApple(){
		Demo8 a = new Demo8();
		return a;
	}
	
	static int[] getMarks()
	{
		int marks[] = {1,2,3,4,5,6};
		return marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getApple());
		//System.out.println(Demo8.getMarks());
		int[] s = getMarks();
		System.out.println(s[1]);
	}

}

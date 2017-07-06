package practice;

public class Demo11_forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11_forEachLoop	oranges[] = {new Demo11_forEachLoop(),new Demo11_forEachLoop(),new Demo11_forEachLoop()};
		//int count = oranges.length;
		//for(int i=0;i<=count;i++){
		//	System.out.println(oranges[i]);
		//}
		
		for(Demo11_forEachLoop o:oranges){
			System.out.println(o);
			
		}

	}

}

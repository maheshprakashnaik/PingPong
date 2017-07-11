package practice;



public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int [3][3];
		int val = 10;
		///System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i].length);
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= val;
				val+=10;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i].length);
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}

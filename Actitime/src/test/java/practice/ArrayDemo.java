package practice;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr1[][] = {{1,2, 3, 4},{1,2, 3},{1,2, 3, 5},{1,2, 3 },{1,2, 3,0 }} ;
		/*for(int arr[] :arr1)
		{
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		
		
		for(int i=0;i<arr1.length;i++)
		{
			//System.out.println(arr[i].length);
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

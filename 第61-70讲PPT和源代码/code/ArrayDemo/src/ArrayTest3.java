import java.util.Arrays;


public class ArrayTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,3,67,90,34,19,8,6,21,10};
		
		for(int i=0;i<arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr); //��arr���������������
		
		System.out.println("\n---------����֮��-----------\n");
		
		for(int i=0;i<arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n---------��������-----------\n");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

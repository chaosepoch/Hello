import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int min;//最小值
		int max;//最大值
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("请输入第"+(i+1)+"个整数：");
			arr[i]=in.nextInt();
			//System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n------------------\n");
		Arrays.sort(arr);//进行升序排序。
		min = arr[0];
		max = arr[arr.length-1];
		System.out.println("最小的元素是："+min);
		System.out.println("最大的元素是："+max);	
	}
	

}

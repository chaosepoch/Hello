import java.util.Arrays;


public class ArraysDemo {

	
	public static void main(String[] args) {
		
		int[] arrs = {23,143,7,22,19,9,0,31,27,47,12};
		
		for(int i=0;i<arrs.length;i++)
		{
			System.out.print(arrs[i]+" ");
		}
		Arrays.sort(arrs);//自动实现排序，默认是升序排序
		System.out.println("\n---------排序之后-----------\n");
		for(int i=0;i<arrs.length;i++)
		{
			System.out.print(arrs[i]+" ");
		}
	}

}

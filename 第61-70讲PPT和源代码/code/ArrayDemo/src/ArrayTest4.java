import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int min;//��Сֵ
		int max;//���ֵ
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("�������"+(i+1)+"��������");
			arr[i]=in.nextInt();
			//System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n------------------\n");
		Arrays.sort(arr);//������������
		min = arr[0];
		max = arr[arr.length-1];
		System.out.println("��С��Ԫ���ǣ�"+min);
		System.out.println("����Ԫ���ǣ�"+max);	
	}
	

}

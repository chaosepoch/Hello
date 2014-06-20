import java.util.Scanner;


public class JieCheng {

	public static void main(String[] args) {
	
		int n ;
		int result=1;//阶乘的结果
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		n = in.nextInt();
		for(int i=n;i>=1;i--)
		{
			result*=i;  //result= result*i;
		}
		System.out.println(n+"的阶乘是："+result);
	}

}

import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
	
		int num;//表示要判断是数字
		boolean flag=true; //先假设是素数
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		num = in.nextInt();
		
		//37数字,2,3,4,...36,  2一直除到这个数的平方根。
		
		//for(int i=2;i<num-1;i++)  //这种写法效率太低。
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0) //说明发生了整除
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+"是素数！");
		}
		else
		{
			System.out.println(num+"不是素数！");
		}
	}

}

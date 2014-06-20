import java.util.Scanner;
import java.util.Stack;


public class StackDemo2 {

	/**
	 * 实现十进制数（正整数）转换为二进制数
	 */
	
	public static void  Convert(int number)
	{
		Stack<Integer> stack = new Stack<Integer>();
		while(number!=0)
		{
			stack.push(number%2);
			number/=2;
		}
		//出栈
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number;
       Scanner in = new Scanner(System.in);
       System.out.println("请输入一个正整数：");
       number = in.nextInt();
       
       StackDemo2.Convert(number);
	}

}

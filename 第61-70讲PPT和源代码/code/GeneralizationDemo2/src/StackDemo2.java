import java.util.Scanner;
import java.util.Stack;


public class StackDemo2 {

	/**
	 * ʵ��ʮ����������������ת��Ϊ��������
	 */
	
	public static void  Convert(int number)
	{
		Stack<Integer> stack = new Stack<Integer>();
		while(number!=0)
		{
			stack.push(number%2);
			number/=2;
		}
		//��ջ
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number;
       Scanner in = new Scanner(System.in);
       System.out.println("������һ����������");
       number = in.nextInt();
       
       StackDemo2.Convert(number);
	}

}

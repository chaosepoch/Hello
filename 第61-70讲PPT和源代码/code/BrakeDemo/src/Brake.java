import java.util.Stack;

//面包类
public class Brake {

	//做面包的锅，最多放十个面包
	public static final int MAX_NUM=10; //最多做十个面包
	Stack<Integer> stack = new Stack<Integer>();
	public static int BRAKE_NUM=0;//面包的个数;
	
	//做面包
	public synchronized void insert(int number)
	{
		stack.push(number);
		Brake.BRAKE_NUM++; //面包数量加一
	}
	
	//取面包
	public synchronized int remove()
	{
		Brake.BRAKE_NUM--;
		return stack.pop();
	}
	
}

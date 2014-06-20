import java.util.Stack;

//�����
public class Brake {

	//������Ĺ�������ʮ�����
	public static final int MAX_NUM=10; //�����ʮ�����
	Stack<Integer> stack = new Stack<Integer>();
	public static int BRAKE_NUM=0;//����ĸ���;
	
	//�����
	public synchronized void insert(int number)
	{
		stack.push(number);
		Brake.BRAKE_NUM++; //���������һ
	}
	
	//ȡ���
	public synchronized int remove()
	{
		Brake.BRAKE_NUM--;
		return stack.pop();
	}
	
}

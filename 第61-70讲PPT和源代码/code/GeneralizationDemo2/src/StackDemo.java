import java.util.Date;
import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("hello");
		stack.push(100);
		stack.push(true);
		stack.push(new Date());
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}

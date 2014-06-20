import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		
		String[] customer = {"张三","李四","王五","赵六","孙七"};
		Queue<String> queue = new LinkedList<String>();
		//入队操作
	    for(String s:customer)
	    {
	    	queue.add(s);
	    }
	    //出队操作
	    while(!queue.isEmpty())
	    {
	    	System.out.println(queue.remove());
	    }
	}

}

import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		
		String[] customer = {"����","����","����","����","����"};
		Queue<String> queue = new LinkedList<String>();
		//��Ӳ���
	    for(String s:customer)
	    {
	    	queue.add(s);
	    }
	    //���Ӳ���
	    while(!queue.isEmpty())
	    {
	    	System.out.println(queue.remove());
	    }
	}

}

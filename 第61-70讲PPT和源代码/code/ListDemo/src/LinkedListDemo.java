import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
 
		LinkedList list = new LinkedList();
		list.add(100);
		list.add("china");
		list.add(true);
		list.add(3.14);
		list.add("china");
		
		for(int i=0;i<list.size();i++)
		{
			//���������򣬴�ӡ�����Ĵ������ӵĴ�����ȫһ�¡�
			System.out.println(list.get(i));
		}
		System.out.println("-------ʹ�õ���������--------");
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		
		list.addFirst("����");//��������ӵ�һ��Ԫ��
		list.addLast("����");//������β�����Ԫ��
		it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------------------");
		
	    //System.out.println(list.peek());//��ȡջ��Ԫ��
		//System.out.println(list.getFirst());
		System.out.println(list.pop());//����ջ��Ԫ��
		System.out.println("----����֮��----");
		it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

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
			//序列是有序，打印出来的次序和添加的次序完全一致。
			System.out.println(list.get(i));
		}
		System.out.println("-------使用迭代器遍历--------");
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		
		list.addFirst("西安");//给链表添加第一个元素
		list.addLast("北京");//给链表尾部添加元素
		it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------------------");
		
	    //System.out.println(list.peek());//获取栈顶元素
		//System.out.println(list.getFirst());
		System.out.println(list.pop());//弹出栈顶元素
		System.out.println("----弹出之后----");
		it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

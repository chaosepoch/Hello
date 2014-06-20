import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
       
		ArrayList list = new ArrayList();
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
		
		//list.clear();//清空序列
		//System.out.println(list.size());
		if(list.contains("france"))
		{
			System.out.println("包含 \"france\"字符串");
		}	
		else
		{
			System.out.println("不包含 \"france\"字符串");
		}
		
		System.out.println(list.indexOf("china"));
			
		Object[] objs =  list.toArray();//转换为对象数组
		System.out.println("-------------------");
		for(int i=0;i<objs.length;i++)
		{
			System.out.println(objs[i]);
		}
	}

}

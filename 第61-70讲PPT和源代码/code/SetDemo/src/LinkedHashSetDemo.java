import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("china");
		set.add("windows");
		set.add("admin");
		set.add("canon");
		set.add("china");//不允许添加重复元素
		set.add("picture");
		set.add(null);//可以添加null值
		set.add("monkey");
		set.add("Windows");
		
		//遍历的结果是有序的。
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}

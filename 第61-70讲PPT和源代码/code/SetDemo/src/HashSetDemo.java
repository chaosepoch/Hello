import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("china");
		set.add(100);
		set.add(true);
		set.add('A');
		set.add(3.1415);
		set.add(null);//可以添加null值。
		set.add("china");
		
		/*无法使用for循环来遍历Set集合
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.);
		}*/
		
		//使用Iterator进行遍历，遍历出来的结果是无序的。
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		set.remove("china");
		
		System.out.println("------删除china之后--------");
		it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}

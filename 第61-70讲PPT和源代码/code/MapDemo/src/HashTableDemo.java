import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashTableDemo {

	
	public static void main(String[] args) {
		
		Hashtable map = new Hashtable();
		
		map.put(1, "北京");
		map.put("1", "上海");
		map.put(5, "广州");
		map.put(3, "西安");
		//map.put(null,"武汉"); //键不允许是null
		//map.put(2, null);//值不允许是null
		//map.put(null,null);//键和值都不允许是null.
		
		Set keys = map.keySet();
		
		Iterator it = keys.iterator();
		
		//遍历出来的结果是无序的。
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+"="+map.get(obj));
		}
	}

}

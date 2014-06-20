import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(1, "北京");
		map.put("1", "上海");
		map.put(5, "广州");
		map.put(3, "西安");
		map.put(null,"武汉"); //键允许是null
		map.put(2, null);//值允许是null
		map.put(null,null);//键和值都允许是null,会替换前面的null:武汉.
		
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

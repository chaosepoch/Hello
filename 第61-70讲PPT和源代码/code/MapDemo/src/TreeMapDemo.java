import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

	
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		map.put(1, "北京");
		//map.put(null, "杭州");键不允许是null,
		map.put(4, null);//值允许为null
		//map.put("1", "上海");//错误，要求键的数据类型必须一致。
		map.put(5, "广州");
		map.put(3, "西安");
		
        Set keys = map.keySet();
		
		Iterator it = keys.iterator();
		
		//遍历出来的结果是自然排序的。
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+"="+map.get(obj));
		}
		
	}

}

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

	
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		map.put(1, "����");
		//map.put(null, "����");����������null,
		map.put(4, null);//ֵ����Ϊnull
		//map.put("1", "�Ϻ�");//����Ҫ������������ͱ���һ�¡�
		map.put(5, "����");
		map.put(3, "����");
		
        Set keys = map.keySet();
		
		Iterator it = keys.iterator();
		
		//���������Ľ������Ȼ����ġ�
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+"="+map.get(obj));
		}
		
	}

}

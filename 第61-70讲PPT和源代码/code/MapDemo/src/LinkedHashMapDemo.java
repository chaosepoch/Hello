import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;


public class LinkedHashMapDemo {

	
	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap();
		map.put(1, "����");
		map.put("1", "�Ϻ�");
		map.put(5, "����");
		map.put(3, "����");
		map.put(null,"�人"); //��������null
		map.put(2, null);//ֵ������null
		map.put(null,null);//����ֵ��������null,���滻ǰ���null:�人.
		
		Set keys = map.keySet();
		
		Iterator it = keys.iterator();
		
		//���������Ľ��������ġ�
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+"="+map.get(obj));
		}
	}

}

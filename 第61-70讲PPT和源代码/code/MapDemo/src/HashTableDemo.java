import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashTableDemo {

	
	public static void main(String[] args) {
		
		Hashtable map = new Hashtable();
		
		map.put(1, "����");
		map.put("1", "�Ϻ�");
		map.put(5, "����");
		map.put(3, "����");
		//map.put(null,"�人"); //����������null
		//map.put(2, null);//ֵ��������null
		//map.put(null,null);//����ֵ����������null.
		
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

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("china");
		set.add("windows");
		set.add("admin");
		set.add("canon");
		set.add("china");//����������ظ�Ԫ��
		set.add("picture");
		set.add(null);//�������nullֵ
		set.add("monkey");
		set.add("Windows");
		
		//�����Ľ��������ġ�
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}

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
		set.add(null);//�������nullֵ��
		set.add("china");
		
		/*�޷�ʹ��forѭ��������Set����
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.);
		}*/
		
		//ʹ��Iterator���б��������������Ľ��������ġ�
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		set.remove("china");
		
		System.out.println("------ɾ��china֮��--------");
		it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}

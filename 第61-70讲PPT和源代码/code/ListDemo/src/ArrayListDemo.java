import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
       
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("china");
		list.add(true);
		list.add(3.14);
		list.add("china");
		
		for(int i=0;i<list.size();i++)
		{
			//���������򣬴�ӡ�����Ĵ������ӵĴ�����ȫһ�¡�
			System.out.println(list.get(i));
		}
		System.out.println("-------ʹ�õ���������--------");
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//list.clear();//�������
		//System.out.println(list.size());
		if(list.contains("france"))
		{
			System.out.println("���� \"france\"�ַ���");
		}	
		else
		{
			System.out.println("������ \"france\"�ַ���");
		}
		
		System.out.println(list.indexOf("china"));
			
		Object[] objs =  list.toArray();//ת��Ϊ��������
		System.out.println("-------------------");
		for(int i=0;i<objs.length;i++)
		{
			System.out.println(objs[i]);
		}
	}

}

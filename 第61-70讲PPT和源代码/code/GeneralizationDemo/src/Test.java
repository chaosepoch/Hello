import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Books> list = new ArrayList<Books>();
	    //ArrayList list = new ArrayList();
		//list.add("hello");
		//list.add(true);
		//list.add(3.14);
		list.add(new Books("��¥��","������ѧ������",150));
		list.add(new Books("����","������ѧ������",120));
		list.add(new Books("ˮ�","������ѧ������",180));
		list.add(new Books("���μ�","������ѧ������",110));
		
		/*
		for(int i=0;i<list.size();i++)
		{
			Books b = (Books)list.get(i);//�����ʹ�÷��ͣ��������ǿ������ת����
			System.out.println(b.showInfo());
		}*/
		
		//ʹ��foreachѭ���������ϡ�
		for(Books b:list)
		{
			System.out.println(b.showInfo());
		}
		
		int[] arr = {0,1,2,3,4,5};
		for(int i:arr)
		{
			i++;
			System.out.println(i);
		}
  		System.out.println("------------------");
  		//foreachѭ����ֻ���ġ�
  		for(int i:arr)
		{
			//i++;
			System.out.println(i);
		}
	}

}

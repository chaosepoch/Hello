
public class Person {
  
	String name; //����
 	int age; //����
 	static int number = 0;
 	
 	//�����Ǿ�̬�����
 	static
 	{
 		System.out.println("��̬�����ִ����....");
 	}
 	
 	Person()
 	{
 		System.out.println("һ���˵�����...");
 		number++;
 	}
 	
 	//��������˷�������
 	Person(String name,int age)
 	{
 		this();
 		this.name = name;
 		this.age = age;
 	}
 	
 	public static void worldPeace()
 	{
 		System.out.println("���������ƽ....");
 	}
 	
 	public void thinking()
 	{
 		System.out.println(this.name+"����˼��ing....");
 	}
 	
 	public static void main(String[] args)
 	{
 		Person p1 = new Person("������",60);//�ڶ��ڴ��з��䡣
 		p1.thinking();
 	    System.out.println("�����˿������ǣ�"+Person.number);
 	    System.out.println("�����˿������ǣ�"+p1.number);
 	    Person p2 = new Person("������",60);
 	    p2.thinking();
 	    System.out.println("�����˿������ǣ�"+Person.number);
	    System.out.println("�����˿������ǣ�"+p2.number);
	    System.out.println("�����˿������ǣ�"+p1.number);
 	    
	    Person.worldPeace();
	    p1.worldPeace();
	    p2.worldPeace();
	    
	    System.out.println(p1==p2);
	    
	    
	    
 	}
}

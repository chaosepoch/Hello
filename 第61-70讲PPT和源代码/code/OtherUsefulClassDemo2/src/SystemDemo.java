import java.util.Scanner;

class Person
{
   	String name;
   	int age;
   	
   	Person(String name,int age)
   	{
   		this.name = name;
   		this.age = age;
   	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("һ��������󼴽�����....");
	}
   	
   	
}


public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("hello");//��׼�����������out
       Scanner in = new Scanner(System.in); //��׼��������in
       System.err.println("this is a error!");
       //System.exit(0);//0����ʾ�����˳�����ǰ���еĳ����������˳���
       
       System.getProperties().list(System.out);
       System.out.println("------------------");
       System.out.println(System.getProperty("os.name")); //��ӡ����ϵͳ������
       /*
       long startTime = System.currentTimeMillis();//����ʼʱ��
       for(int i=0;i<10000;i++)
       {
    	   System.out.println(i);
       }
       long endTime = System.currentTimeMillis();
       System.out.println("��������ʱ��Ϊ��"+(endTime-startTime)+"ms");
       */
       
       Person p = new Person("����",30);
       p = null;
       System.gc();//��������������
	}

}

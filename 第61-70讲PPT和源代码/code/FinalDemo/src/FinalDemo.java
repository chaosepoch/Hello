class Person
{
   String name;
   int age;
    
   Person()
   {
	   
   }
   
   Person(String name,int age)
   {
	   this.name = name;
	   this.age = age;
   }
   public void showInfo()
   {
	   System.out.println("������"+this.name+"�����䣺"+this.age);
   }
}


public class FinalDemo {

	//final int NUM =100; //�����ͬʱ�����г�ʼ����
	final int NUM;
	
	final Person p;
	
	FinalDemo()
	{
		this.NUM=100; //�ڹ��췽�����г�ʼ��
		this.p = new Person("������",20);
	}
	
	public void change(final Person p)
	{
		//p.name = "������"; //��ȷ�ģ������ֵ���Ըı䡣
		//p = new Person("������",60);���󣬶��󲻿��Ըı�
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FinalDemo f = new FinalDemo();
        //f.NUM = 50; //����final���Ͳ��ɸı�
        
        //f.p.name = "������"; //��ȷ�ģ������ֵ���Ըı䡣
        //f.p.showInfo();
        
        //f.p = new Person("������",60);���󣬶��󲻿ɸı䡣
        Person p = new Person("�ŷ�",30);
        f.change(p);
        p.showInfo();
	}

}

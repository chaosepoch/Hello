
public class Person {

	String name;
	String gender;
	int age;
	
	Person()
	{
	   System.out.println("һ���˵�����....");
	   this.name = "������";
	   this.gender = "��";
	   this.age = 18;
	}
	Person(String name,int age)
	{
		this();//������ڹ��췽���ĵ�һ��
		this.name = name;
		this.age = age;
	}
	Person(String name,String gender,int age)
	{
		this(name,age);//������ڹ��췽���ĵ�һ��
		this.gender = gender;
	}
	public void introduce()
	{
		System.out.println("�ҽУ�"+this.name+"���Ա�"+this.gender+"�����꣺"+this.age+"�꣡");
	}
	
	public static void main(String[] args)
	{
		//Person p = new Person();
		Person p = new Person("������","Ů",20);
	    p.introduce();
	}
}

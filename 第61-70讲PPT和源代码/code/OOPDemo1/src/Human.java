//����
public class Human {

	//����
	String name;  //����
	String gender; //�Ա�
	int age; //����
	
	/* ϵͳ������������¹��췽��
	 * 
	 * Human()
	 * {
	 * 
	 * }
	 * 
	 * */
	
	Human()
	{
		System.out.println("һ���˴������ϵ�����....");
		this.name = "������";
		this.gender = "��";
		this.age = 18;
	}
	
	Human(String name,String gender,int age)
	{
		this();//���ò��������Ĺ��췽����
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	//����
	//˼��
	public void thinking()
	{
		System.out.println("����˼��ing...");
	}
	//�Է�
	public void eat()
	{
		System.out.println("���ڳԷ�ing...");
	}
	//˯��
	public void sleep()
	{
		System.out.println("����˯��zzz....");
	}
	
	//�����ҽ��ܵķ���
	public void introduce()
	{
		System.out.println("�ҽУ�"+this.name+"���Ա�"+this.gender+"�����꣺"+this.age+"�ꡣ");
	}
	
	public static void main(String[] args)
	{
		Human h1 = new Human("����","��",20);
		//h1.name="����";
		//h1.gender="��";
		//h1.age = 20;
		h1.introduce();
		h1.eat();
		h1.thinking();
		h1.sleep();
		
	}
}

//ѧ����
public class Students {

	String sid;//ѧ��
	String name;//����
	char gender;//�Ա�  M��male ����  F��female Ů��
	int age;
	String major;
	String email;
	String qq;
	String address;
	
	static int number=0;
	
	Students()
	{
		System.out.println("������һ��ѧ��....");
		number++;
	}
	
	Students(String sid,String name,char gender,int age,String major,String email,String qq,String address)
	{
		this();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.email = email;
		this.qq = qq;
		this.address = address;
	
	}
	
	public void goToClassroom()
	{
		System.out.println(this.name+"�˸߲��ҵ�ȥ�Ͽ���....");
	}
	
	public void goToExam()
	{
		System.out.println(this.name+"���ĵ�����ȥ������.....");
	}
	
	public static void study()
	{
		System.out.println("Good good study,day day up!");
	}
	
	public static void main(String[] args)
	{
		Students s = new Students("S001","������",'F',18,"���̹���","gmm@163.com","1234567","�����д�ѧ��");
	    s.goToClassroom();
	    s.goToExam();
	    System.out.println("ѧ��������"+Students.number);
	    Students.study();
	}
}

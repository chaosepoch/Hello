//ѧ����
public class Students {

	String name;//����
	char gender;//�Ա�  M:��ʾ����  F����ʾŮ��
	int age;//����
	
	Students()
	{
		System.out.println("������һ��ѧ������....");
	}
	
	Students(String name,char gender,int age)
	{
		this();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void introduce()
	{
		System.out.println("������"+this.name+"���Ա�"+this.gender+"�����䣺"+this.age);
	}
}

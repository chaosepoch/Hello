//����
//Ҫ����һ����Ķ����ܹ���¡������ʵ�����㣺
//1.ʵ��Cloneable�ӿڣ�����ʽ�ӿڡ�
//2.��д��Object�̳е�clone()������
class Person implements Cloneable{

	private String name;// ����
	private int age;// ����

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������"+this.getName()+"�����䣺"+this.getAge();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getName().hashCode()+this.getAge();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person)
		{
			Person p = (Person)obj;
			if(this.getName().equals(p.getName())&&(this.getAge()==p.getAge()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
    
	
}

public class ObjectDemo {

	public static void main(String[] args) {
       
		Person p1 = new Person("����",20);
		System.out.println(p1);
		System.out.println("p1�����hashCode:"+p1.hashCode());
		System.out.println("------------------------");
		Person p2 = new Person("����",20);
		System.out.println("p1�����hashCode:"+p1.hashCode());
		System.out.println("p2�����hashCode:"+p2.hashCode());
		
		System.out.println(p1==p2);//false
		System.out.println(p1.equals(p2));//false
		
		System.out.println("------------------------");
		String s1 = new String("I love you china!");
		String s2 = new String("I love you china!");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode()==s2.hashCode());
		//String���Ǹ���������࣬��д��hashCode()������ʹ�������ַ������������ȣ���ôhashCode()Ҳ��ȡ�
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("--------ǳ����------------");
		Person p3 = p2; //ǳ����
		System.out.println(p2);
		System.out.println(p3);
		p3.setName("������");
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("--------���------------");
		try
		{
		   Person p4 =(Person)p1.clone();//�������p1����ĸ�������p4;
		   System.out.println(p1);
		   System.out.println(p4);
		   p4.setName("������");
		   System.out.println(p1);
		   System.out.println(p4);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

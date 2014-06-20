//人类
//要想让一个类的对象能够克隆，必须实现两点：
//1.实现Cloneable接口，声明式接口。
//2.重写从Object继承的clone()方法。
class Person implements Cloneable{

	private String name;// 姓名
	private int age;// 年龄

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
		return "姓名："+this.getName()+"，年龄："+this.getAge();
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
       
		Person p1 = new Person("张三",20);
		System.out.println(p1);
		System.out.println("p1对象的hashCode:"+p1.hashCode());
		System.out.println("------------------------");
		Person p2 = new Person("张三",20);
		System.out.println("p1对象的hashCode:"+p1.hashCode());
		System.out.println("p2对象的hashCode:"+p2.hashCode());
		
		System.out.println(p1==p2);//false
		System.out.println(p1.equals(p2));//false
		
		System.out.println("------------------------");
		String s1 = new String("I love you china!");
		String s2 = new String("I love you china!");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode()==s2.hashCode());
		//String类是个很特殊的类，重写了hashCode()方法，使得两个字符串如果内容相等，那么hashCode()也相等。
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("--------浅拷贝------------");
		Person p3 = p2; //浅拷贝
		System.out.println(p2);
		System.out.println(p3);
		p3.setName("张三丰");
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("--------深拷贝------------");
		try
		{
		   Person p4 =(Person)p1.clone();//深拷贝，把p1对象的副本给了p4;
		   System.out.println(p1);
		   System.out.println(p4);
		   p4.setName("张三丰");
		   System.out.println(p1);
		   System.out.println(p4);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

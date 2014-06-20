
public class Person {

	String name;
	String gender;
	int age;
	
	Person()
	{
	   System.out.println("一个人诞生了....");
	   this.name = "无名氏";
	   this.gender = "男";
	   this.age = 18;
	}
	Person(String name,int age)
	{
		this();//必须放在构造方法的第一句
		this.name = name;
		this.age = age;
	}
	Person(String name,String gender,int age)
	{
		this(name,age);//必须放在构造方法的第一句
		this.gender = gender;
	}
	public void introduce()
	{
		System.out.println("我叫："+this.name+"，性别："+this.gender+"，今年："+this.age+"岁！");
	}
	
	public static void main(String[] args)
	{
		//Person p = new Person();
		Person p = new Person("郭美美","女",20);
	    p.introduce();
	}
}

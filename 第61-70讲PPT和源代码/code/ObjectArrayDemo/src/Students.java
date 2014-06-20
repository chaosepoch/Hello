//学生类
public class Students {

	String name;//姓名
	char gender;//性别  M:表示男生  F：表示女生
	int age;//年龄
	
	Students()
	{
		System.out.println("创建了一个学生对象....");
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
		System.out.println("姓名："+this.name+"，性别："+this.gender+"，年龄："+this.age);
	}
}

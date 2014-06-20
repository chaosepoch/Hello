//人类
public class Human {

	//属性
	String name;  //姓名
	String gender; //性别
	int age; //年龄
	
	/* 系统会帮我生成如下构造方法
	 * 
	 * Human()
	 * {
	 * 
	 * }
	 * 
	 * */
	
	Human()
	{
		System.out.println("一个人从世界上诞生了....");
		this.name = "无名氏";
		this.gender = "男";
		this.age = 18;
	}
	
	Human(String name,String gender,int age)
	{
		this();//调用不带参数的构造方法。
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	//方法
	//思考
	public void thinking()
	{
		System.out.println("正在思考ing...");
	}
	//吃饭
	public void eat()
	{
		System.out.println("正在吃饭ing...");
	}
	//睡觉
	public void sleep()
	{
		System.out.println("正在睡觉zzz....");
	}
	
	//做自我介绍的方法
	public void introduce()
	{
		System.out.println("我叫："+this.name+"，性别："+this.gender+"，今年："+this.age+"岁。");
	}
	
	public static void main(String[] args)
	{
		Human h1 = new Human("张三","男",20);
		//h1.name="张三";
		//h1.gender="男";
		//h1.age = 20;
		h1.introduce();
		h1.eat();
		h1.thinking();
		h1.sleep();
		
	}
}

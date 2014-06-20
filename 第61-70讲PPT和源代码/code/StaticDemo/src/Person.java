
public class Person {
  
	String name; //姓名
 	int age; //年龄
 	static int number = 0;
 	
 	//这里是静态代码块
 	static
 	{
 		System.out.println("静态代码块执行了....");
 	}
 	
 	Person()
 	{
 		System.out.println("一个人诞生了...");
 		number++;
 	}
 	
 	//这里出现了方法重载
 	Person(String name,int age)
 	{
 		this();
 		this.name = name;
 		this.age = age;
 	}
 	
 	public static void worldPeace()
 	{
 		System.out.println("呼吁世界和平....");
 	}
 	
 	public void thinking()
 	{
 		System.out.println(this.name+"正在思考ing....");
 	}
 	
 	public static void main(String[] args)
 	{
 		Person p1 = new Person("张三丰",60);//在堆内存中分配。
 		p1.thinking();
 	    System.out.println("世界人口数量是："+Person.number);
 	    System.out.println("世界人口数量是："+p1.number);
 	    Person p2 = new Person("张三丰",60);
 	    p2.thinking();
 	    System.out.println("世界人口数量是："+Person.number);
	    System.out.println("世界人口数量是："+p2.number);
	    System.out.println("世界人口数量是："+p1.number);
 	    
	    Person.worldPeace();
	    p1.worldPeace();
	    p2.worldPeace();
	    
	    System.out.println(p1==p2);
	    
	    
	    
 	}
}

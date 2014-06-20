
public class Person {
  
	String name;
	int age;
	
	Person()
	{
		
	}
	
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void thinking()
	{
		System.out.println(this.name +"正在思考ing...");
	}
	
	public static void main(String[] args)
	{
		//new Person("张三",20).thinking();
		
		if(args.length<3)
		{
			System.out.println("输入的参数个数必须为三个！");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
	}
}


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
		System.out.println(this.name +"����˼��ing...");
	}
	
	public static void main(String[] args)
	{
		//new Person("����",20).thinking();
		
		if(args.length<3)
		{
			System.out.println("����Ĳ�����������Ϊ������");
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

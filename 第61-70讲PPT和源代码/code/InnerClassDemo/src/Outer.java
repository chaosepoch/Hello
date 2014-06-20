//外部类
public class Outer {

	String name;
	
	Outer()
	{
		System.out.println("Outer Class Constructor...");
	}
	
	Outer(String name)
	{
		this();
		this.name = name;
	}
	
	public void showName()
	{
		System.out.println("Outer Class Name is:"+this.name);
	}
	
	public void fun(String name)
	{
		//在成员方法中定义一个内部类
		class Inner3{
			String name;
			
			Inner3()
			{
				System.out.println("Inner3 Class Constructor...");
			}
			
			Inner3(String name)
			{
				this();
				this.name = name;
			}
			
			public void showName()
			{
				System.out.println("Inner3 Class Name is:"+this.name);
			}
		}
		new Inner3(name).showName();
	}
	
	public static void method(String name)
	{
		class Inner4{
            String name;
			
			Inner4()
			{
				System.out.println("Inner4 Class Constructor...");
			}
			
			Inner4(String name)
			{
				this();
				this.name = name;
			}
			
			public void showName()
			{
				System.out.println("Inner4 Class Name is:"+this.name);
			}
		}
		new Inner4(name).showName();
	}
	
	//定义普通的内部类
	class Inner{
		
		String name;
		
		Inner()
		{
			System.out.println("Inner Class Constructor...");
		}
		
		Inner(String name)
		{
			this();
			this.name = name;
		}
		
		public void showName()
		{
			System.out.println("Inner Class Name is:"+this.name);
		}
	}
	
	//定义一个静态的内部类
	static class Inner2{
        String name;
		
		Inner2()
		{
			System.out.println("Inner2 Class Constructor...");
		}
		
		Inner2(String name)
		{
			this();
			this.name = name;
		}
		
		public void showName()
		{
			System.out.println("Inner2 Class Name is:"+this.name);
		}
		
	}
	
	public static void main(String[] args)
	{
		Outer outer = new Outer("zhangsan");
		outer.showName();
		System.out.println("-----------------");
		Inner inner = new Outer().new Inner("lisi");
		inner.showName();
		System.out.println("-----------------");
		Outer.Inner2 inner2 = new Inner2("王五");
		//Inner2 inner2 = new Outer().new Inner2();
		inner2.showName();
		System.out.println("-----------------");
		outer.fun("赵六");
		System.out.println("-----------------");
		Outer.method("孙七");
	}
}

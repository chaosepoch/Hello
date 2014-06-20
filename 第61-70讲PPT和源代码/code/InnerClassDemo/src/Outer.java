//�ⲿ��
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
		//�ڳ�Ա�����ж���һ���ڲ���
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
	
	//������ͨ���ڲ���
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
	
	//����һ����̬���ڲ���
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
		Outer.Inner2 inner2 = new Inner2("����");
		//Inner2 inner2 = new Outer().new Inner2();
		inner2.showName();
		System.out.println("-----------------");
		outer.fun("����");
		System.out.println("-----------------");
		Outer.method("����");
	}
}

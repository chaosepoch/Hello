
public class B  extends A{
    
	String name = "李四";
	
	B()
	{
		
	}
	
	B(String name)
	{
		super(name);//调用父类的构造方法，必须是第一句。
		//this();//调用本类的构造方法，也必须是第一句
		System.out.println("B constructor B(String) is executing...");
		System.out.println("super name:"+super.name);//获得父类对象的属性。
		this.name = name;
	}
	@Override
	public void fn()
	{
		System.out.println(" B class fn() executing...");
	}
	
	public static void main(String[] args) {
		
		//B b = new B();
		/*
		A a = new B();
		System.out.println(a.name);//属性不体现多态性。
		a.fn();//会体现多态性*/
		
		B b = new B("王老吉");
		System.out.println(b.name);//属性不体现多态性。
		b.fn();
	}
}

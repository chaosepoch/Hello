package cn.net;
//同一个类当中
public class A {
  
	public int num =100;
	private String name = "zhangsan";
	protected double d = 3.14;
	boolean flag = false; //默认访问修饰符
	
	/* A()
	 * {
	 * 
	 * }
	 * 
	 * */
	/*
	public A()
	{
		
	}*/
	
	public void fn()
	{
		System.out.println("A class fn()....");
	}
	private void m1()
	{
		System.out.println("A class m1()....");
	}
	protected void foo()
	{
		System.out.println("A class foo()....");
	}
	
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.num);
		System.out.println(a.name);
		System.out.println(a.d);
		System.out.println(a.flag);
		
		a.fn();
		a.foo();
		a.m1();
	}
}

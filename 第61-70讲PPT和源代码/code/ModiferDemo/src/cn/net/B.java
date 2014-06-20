package cn.net;
//同一个包中的任意类
public class B {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.num);
		System.out.println(a.d);
		System.out.println(a.flag);
		//System.out.println(a.name);//无法访问，因为是private。
		a.fn();
		a.foo();
		//a.m1();//无法访问，因为是private;
	}
}

package cn.com;

import cn.net.A;
//外包中的子类
public class D extends A{
   
	public static void main(String[] args) {
		A a = new A();
		D d = new D();
		System.out.println(a.num);
		//System.out.println(a.d);//属性值是继承不过来。
	    System.out.println(d.d); //通过继承访问
	    //System.out.println(a.flag);//无法访问
	    //System.out.println(d.flag);//无法访问
	    a.fn();
	    //a.foo();//无法访问
	    d.foo();//通过继承访问
	    
	}
}

package cn.com;

import cn.net.A;

//外包当中的非子类
public class E {
   
   public static void main(String[] args) {
	    
	   A a = new A();//构造方法是例外情况。
	   System.out.println(a.num);
	   //System.out.println(a.d); //无法访问
	   //System.out.println(a.name);//无法访问
	   //System.out.println(a.flag);//无法访问
	   a.fn();
	   //a.foo();//无法访问
	   //a.m1();//无法访问
   }
}

package cn.net;
//ͬһ�����е�����
public class C extends A{

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.d);
		System.out.println(a.num);
		System.out.println(a.flag);
		//System.out.println(a.name);//�޷����ʣ���Ϊ��private;
		a.fn();
		a.foo();
		//a.m1();//�޷����ʣ���Ϊ��private;
	}
}

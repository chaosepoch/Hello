package cn.com;

import cn.net.A;
//����е�����
public class D extends A{
   
	public static void main(String[] args) {
		A a = new A();
		D d = new D();
		System.out.println(a.num);
		//System.out.println(a.d);//����ֵ�Ǽ̳в�������
	    System.out.println(d.d); //ͨ���̳з���
	    //System.out.println(a.flag);//�޷�����
	    //System.out.println(d.flag);//�޷�����
	    a.fn();
	    //a.foo();//�޷�����
	    d.foo();//ͨ���̳з���
	    
	}
}


public class B  extends A{
    
	String name = "����";
	
	B()
	{
		
	}
	
	B(String name)
	{
		super(name);//���ø���Ĺ��췽���������ǵ�һ�䡣
		//this();//���ñ���Ĺ��췽����Ҳ�����ǵ�һ��
		System.out.println("B constructor B(String) is executing...");
		System.out.println("super name:"+super.name);//��ø����������ԡ�
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
		System.out.println(a.name);//���Բ����ֶ�̬�ԡ�
		a.fn();//�����ֶ�̬��*/
		
		B b = new B("���ϼ�");
		System.out.println(b.name);//���Բ����ֶ�̬�ԡ�
		b.fn();
	}
}

//�������С����
public class A<T> {

	private T obj;
	
	A(T obj)
	{
		this.obj = obj;
	}
	
	public void showType()
	{
		System.out.println("�����ʵ�������ǣ�"+this.obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		A  obj = new A(100);
		obj.showType();
		obj = new A("100");
		obj.showType();
		obj = new A(new Books("��¥��","������ѧ������",120));
		obj.showType();
	}
}

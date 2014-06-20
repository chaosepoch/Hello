//泛型类的小例子
public class A<T> {

	private T obj;
	
	A(T obj)
	{
		this.obj = obj;
	}
	
	public void showType()
	{
		System.out.println("对象的实际类型是："+this.obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		A  obj = new A(100);
		obj.showType();
		obj = new A("100");
		obj.showType();
		obj = new A(new Books("红楼梦","人民文学出版社",120));
		obj.showType();
	}
}

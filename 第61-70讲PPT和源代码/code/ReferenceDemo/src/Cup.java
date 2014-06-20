//水杯
public class Cup {

	String owner;//水杯的主人
	String content;//水杯里的东西
	
	Cup()
	{
		
	}
	Cup(String owner,String content)
	{
		this.owner = owner;
		this.content = content;
	}
	
	public static void changeContent(Cup c) //引用传递
	{
		System.out.println("在changContent方法里面："+c.hashCode());
		//c.content = "普洱茶";
		c = new Cup("张无忌","可口可乐");
		System.out.println("在changContent方法里面："+c.hashCode());
	}
	
	public void showContent()
	{
		System.out.println(this.owner+"的水杯，里面装着："+this.content);
	}
	
	public static void main(String[] args)
	{
		Cup c = new Cup("张三丰","碧螺春");
		c.showContent();
		System.out.println("--------------------");
		System.out.println("在主方法里面："+c.hashCode());
		Cup.changeContent(c);
		c.showContent();
	}
}

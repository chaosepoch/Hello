//颜色的枚举类型
public enum MyColor {

	//直接定义枚举类型常来，一般都是大写字母,常量之间使用逗号分隔
	RED("红色"),GREEN("绿色"),BLUE("蓝色"),WHITE("白色"),BLACK("黑色");
	private String name;//属性
	
	MyColor()
	{
		System.out.println("诞生了一种颜色...");
	}
	MyColor(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	/*
	public static void main(String[] args) {
		MyColor c = new MyColor();
	}*/
}

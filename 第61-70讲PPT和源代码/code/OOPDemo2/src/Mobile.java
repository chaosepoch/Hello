//手机类
public class Mobile {

	String brand; //品牌
	String color; //颜色
	double price; //价格
	
	Mobile()
	{
		System.out.println("一个手机出厂了....");
	}
	
	Mobile(String brand,String color,double price)
	{
		this();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void phone()
	{
		System.out.println(this.brand+"牌手机通话中....");
	}
	
	public void sendMessage(String msg)
	{
		System.out.println(this.brand+"发送短信:"+msg);
	}
	
	public static void main(String[] args)
	{
		Mobile m1 =new Mobile("iPhone","黑色",4000);
		Mobile m2 =new Mobile("lenovo","红色",2000);
		Mobile m3 =new Mobile("HTC","白色",2500);
		
		m1.phone();
		m2.sendMessage("大家好！");
		m3.sendMessage("晚安！");
		
	}
	
}

//手机抽象类
public abstract class Mobile {
    
	String brand;//手机品牌
	String color;//颜色
	
	//开机方法
	public void powerOn()
	{
		System.out.println(this.brand+"牌手机开机...");
	}
	
	//关机方法
	public void powerOff()
	{
		System.out.println(this.brand+"牌手机关机...");
	}
	
	//发短信方法
	public void sendMessage()
	{
		System.out.println(this.brand+"发送短信...");
	}
	
	//打电话方法
	public void phone()
	{
		System.out.println(this.brand+"通话中...");
	}
}

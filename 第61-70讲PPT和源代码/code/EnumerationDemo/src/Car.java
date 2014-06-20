//小轿车类
public class Car {

	private String brand;//品牌
	private MyColor color = MyColor.BLACK;//颜色
	
	Car()
	{
	   System.out.println("一辆小轿车诞生了...");	
	}
	Car(String brand,MyColor color)
	{
		this.brand =brand;
		this.color = color;
	}
	public String toString()
	{
		return "品牌："+this.brand+",颜色："+this.color;
	}
}

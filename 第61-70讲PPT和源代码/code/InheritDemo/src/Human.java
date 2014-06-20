//人类
public class Human extends Animal{

	Human()
	{
		System.out.println("一个人从世界上诞生了...");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("躺在床上舒服地睡觉zzz....");
	}
}

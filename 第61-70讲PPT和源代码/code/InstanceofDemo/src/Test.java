
public class Test {

	public static void checkAnimal(Animal a)
	{
		if( a instanceof Pet)//如果是宠物
		{
			if( a instanceof CatchMouse) //判断是否能捉耗子的宠物
			{
				System.out.println("该动物是能捉耗子的宠物....");
			}
			else
			{
				System.out.println("该动物是普通宠物...");
			}
		}
		else
		{
			System.out.println("该动物不是宠物...");
		}
		
	}
	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		Test.checkAnimal(a);
	}

}

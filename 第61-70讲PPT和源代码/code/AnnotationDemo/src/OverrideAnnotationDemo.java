
class Animal{
	
	public void sleep()
	{
		System.out.println("动物在睡觉zzz...");
	}
}

class Person extends Animal{
	
	@Override
	public void sleep()
	{
		System.out.println("躺在床上睡觉zzz...");
	}
	
}

public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		Animal a = new Person();
		a.sleep();
	}
}

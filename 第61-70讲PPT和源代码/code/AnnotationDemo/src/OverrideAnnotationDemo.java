
class Animal{
	
	public void sleep()
	{
		System.out.println("������˯��zzz...");
	}
}

class Person extends Animal{
	
	@Override
	public void sleep()
	{
		System.out.println("���ڴ���˯��zzz...");
	}
	
}

public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		Animal a = new Person();
		a.sleep();
	}
}

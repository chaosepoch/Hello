
public class Test {

	public static void checkAnimal(Animal a)
	{
		if( a instanceof Pet)//����ǳ���
		{
			if( a instanceof CatchMouse) //�ж��Ƿ���׽���ӵĳ���
			{
				System.out.println("�ö�������׽���ӵĳ���....");
			}
			else
			{
				System.out.println("�ö�������ͨ����...");
			}
		}
		else
		{
			System.out.println("�ö��ﲻ�ǳ���...");
		}
		
	}
	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		Test.checkAnimal(a);
	}

}

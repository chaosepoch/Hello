//ƻ���ֻ�
public class Apple extends Mobile implements AI {

	Apple()
	{
		
	}
	
	Apple(String brand,String color)
	{
		this.brand = brand;
		this.color = color;
	}
	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"���ֻ�����...");
	}

	@Override
	public void office() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"���ֻ��칫...");
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"���ֻ���������...");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"���ֻ�����...");
	}
}

//三星手机类
public class Samsung extends Mobile implements AI {

	Samsung()
	{
		
	}
	
	Samsung(String brand,String color)
	{
		this.brand = brand;
		this.color = color;
	}
	
	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"牌手机上网...");
	}

	@Override
	public void office() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"牌手机办公...");
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"牌手机播放音乐...");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+"牌手机拍照...");
	}

}

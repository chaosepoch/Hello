//��ɫ��ö������
public enum MyColor {

	//ֱ�Ӷ���ö�����ͳ�����һ�㶼�Ǵ�д��ĸ,����֮��ʹ�ö��ŷָ�
	RED("��ɫ"),GREEN("��ɫ"),BLUE("��ɫ"),WHITE("��ɫ"),BLACK("��ɫ");
	private String name;//����
	
	MyColor()
	{
		System.out.println("������һ����ɫ...");
	}
	MyColor(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	/*
	public static void main(String[] args) {
		MyColor c = new MyColor();
	}*/
}

//�ֻ���
public class Mobile {

	String brand; //Ʒ��
	String color; //��ɫ
	double price; //�۸�
	
	Mobile()
	{
		System.out.println("һ���ֻ�������....");
	}
	
	Mobile(String brand,String color,double price)
	{
		this();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void phone()
	{
		System.out.println(this.brand+"���ֻ�ͨ����....");
	}
	
	public void sendMessage(String msg)
	{
		System.out.println(this.brand+"���Ͷ���:"+msg);
	}
	
	public static void main(String[] args)
	{
		Mobile m1 =new Mobile("iPhone","��ɫ",4000);
		Mobile m2 =new Mobile("lenovo","��ɫ",2000);
		Mobile m3 =new Mobile("HTC","��ɫ",2500);
		
		m1.phone();
		m2.sendMessage("��Һã�");
		m3.sendMessage("����");
		
	}
	
}

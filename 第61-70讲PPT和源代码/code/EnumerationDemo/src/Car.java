//С�γ���
public class Car {

	private String brand;//Ʒ��
	private MyColor color = MyColor.BLACK;//��ɫ
	
	Car()
	{
	   System.out.println("һ��С�γ�������...");	
	}
	Car(String brand,MyColor color)
	{
		this.brand =brand;
		this.color = color;
	}
	public String toString()
	{
		return "Ʒ�ƣ�"+this.brand+",��ɫ��"+this.color;
	}
}


public class Books {

	String name;//����
	String press;//������
	double price;//�۸�
	
	Books(String name,String press,double price)
	{
		this.name = name;
		this.press = press;
		this.price = price;
	}
	
	//����ͼ��Ļ�����Ϣ
	public String showInfo()
	{
		return "������"+this.name+",�����磺"+this.press+",�۸�"+this.price;
	}
	
	/*
	public String toString()
	{
		return "������"+this.name+",�����磺"+this.press+",�۸�"+this.price;
	}*/
}

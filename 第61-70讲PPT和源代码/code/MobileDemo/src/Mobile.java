//�ֻ�������
public abstract class Mobile {
    
	String brand;//�ֻ�Ʒ��
	String color;//��ɫ
	
	//��������
	public void powerOn()
	{
		System.out.println(this.brand+"���ֻ�����...");
	}
	
	//�ػ�����
	public void powerOff()
	{
		System.out.println(this.brand+"���ֻ��ػ�...");
	}
	
	//�����ŷ���
	public void sendMessage()
	{
		System.out.println(this.brand+"���Ͷ���...");
	}
	
	//��绰����
	public void phone()
	{
		System.out.println(this.brand+"ͨ����...");
	}
}

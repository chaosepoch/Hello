//��������
public class Productor implements Runnable{

	private Kitchen kitchen;//��������
	
	public Productor(Kitchen kitchen)
	{
		this.kitchen = kitchen;
	}

	@Override
	public void run() {
		
		while(true)
		{
		   //��ν�������߳�
		   if(Kitchen.iCount>100)  //һ�ٸ������������,������������߳�
		   {
			   break;
		   }
		   
		   try
		   {
			  kitchen.make();//���費�ϵ��������
			  //Ϊ���ó��������ÿ��һ���������100����
			  Thread.sleep(100);
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		}
		System.out.println("һ�ٸ���������ˣ�������������������");
		
	}
}

//������
public class Consumer implements Runnable{

private Kitchen kitchen;//��������
	
	public Consumer(Kitchen kitchen)
	{
		this.kitchen = kitchen;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			//��ν��������ߵ��߳�
			if(Kitchen.iCount>100&&Brake.BRAKE_NUM<=0)
			{
				break;
			}
			
			try
			{
				kitchen.eat();//��ͣ�ĳ����������
				//Ϊ���ó��������ÿ��һ���������100����
				Thread.sleep(500);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	
}

//������
public class Kitchen {

	private Brake brake;
	public static int bigNum=0;//���ֳԵ�����;
	public static int smallNum=0;//С�ֳԵ�����;
	public static int TOTOAL_NUM=100;//һ����һ�ٸ����
	public static int iCount=1;//��������ͳ������������ĸ�����
	
	
	public Kitchen(Brake brake)
	{
		this.brake = brake;
	}
	
	//����������ķ���
	public synchronized void make()
	{
		//�����жϹ��Ƿ�����
		if(Brake.BRAKE_NUM<10)//����δ��
		{
			brake.insert(Kitchen.iCount);
			System.out.println("���������˵�"+Kitchen.iCount+"�������");
			Kitchen.iCount++;
			notifyAll();//���Ѷ��ӳ������
		}
		else
		{
			System.out.println("���Ѿ�װ�����ȴ����ӳ����....");
			try
			{
			   wait(); //��������״̬���ȴ��������̵߳Ļ���.
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	//������ķ���
	public synchronized void eat()
	{
		//�����жϹ��Ƿ��ǿյġ�
		if(Brake.BRAKE_NUM>0)
		{
			int temp = brake.remove(); //��óԵ�������ı��
			System.out.println(Thread.currentThread().getName()+"�Ե��˵�"+temp+"�������");
			if(Thread.currentThread().getName().equals("����"))
			{
				bigNum++;
			}
			else
			{
				smallNum++;
			}
			notifyAll();//����������������
		}
		else
		{
			System.out.println("��������ˣ��ȴ����������....");
			try
			{
			   wait(); //��������״̬���ȴ����������̵߳Ļ���.
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
}

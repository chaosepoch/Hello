/* �������������ӣ��ֱ��Ǵ��ֺ�С�֡�
 * 
 * �����������50�������Ž����䡣���ֺ�С��ÿ���ѧ�ؼҶ��Ա�����
 * 
 * ʹ��java���߳��������������⣬ͳ�ƴ��ֺ�С�ָ����˶��ٸ�������
 * 
 * 
 * */

class IceStream implements Runnable
{

	private int iceStreamNum;//����������
	public int bigNum=0;//���ֳԵ�����
	public int smallNum=0;//С�ֳԵ�����
	public boolean flag = true;//�����߳��Ƿ�����Ŀ��ر���
	
	public IceStream(int iceStreamNum)
	{
		this.iceStreamNum = iceStreamNum;
	}
	
	//�Ա�������
	public synchronized void eatIceStream() throws Exception
	{
		if(iceStreamNum<=0) //�������������С�ڵ���0�����˳�
		{
			flag = false;
			return ;
		}
		iceStreamNum--;
		if(Thread.currentThread().getName().equals("����"))
		{
			bigNum++;
			System.out.println("���ֳ���һ����������ʣ"+iceStreamNum+"����");
			Thread.sleep(200);
		}
		else
		{
			smallNum++;
			System.out.println("С�ֳ���һ����������ʣ"+iceStreamNum+"����");
			Thread.sleep(200);
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag)
		{
			try
			{
				eatIceStream();//��ͣ�ĳԱ���
			}
			catch(Exception ex)
			{
				
			}
		}
	}
   
    //ͳ�Ƹ����˶��ٸ�
	public void showResult()
	{
		System.out.println("���ֳ��ˣ�"+bigNum+"��.");
		System.out.println("С�ֳ��ˣ�"+smallNum+"��.");
	}
}

public class IceStreamDemo {

	public static void main(String[] args) {
		
		IceStream ic = new IceStream(50);
		Thread bigSon = new Thread(ic,"����");
		Thread smallSon = new Thread(ic,"С��");
		
		bigSon.start();
		smallSon.start();
		//�ȴ��߳̽�����ͳ�ƽ��
		try
		{
			bigSon.join();
			smallSon.join();
			ic.showResult();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

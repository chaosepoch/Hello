import java.util.concurrent.atomic.AtomicInteger;

//��Ʊ������
public class SaleTicketWindow {

	private Window window;
	public static final int MAX_NUM=1000;//ÿ��10000��Ʊ
	public static AtomicInteger iCount= new AtomicInteger(0);//��Ʊ����������
	private AtomicInteger saleNum = new AtomicInteger(0);//ÿ�����ڵ���Ʊ����;
	
	public SaleTicketWindow(Window window)
	{
		this.window = window;
	}
	
	public Window getWindow()
	{
		return this.window;
	}
	
	//�Ŷ���Ʊ�ķ���
	public synchronized void buyTicket()
	{
		if(window.getLength()<Window.MAX_LEN)
		{
			if(SaleTicketWindow.iCount.get()>=SaleTicketWindow.MAX_NUM) //Ʊ�Ѿ�������
			{
				notify(); //������Ʊ����
				return ;
			}
			SaleTicketWindow.iCount.getAndIncrement();
			window.insert(SaleTicketWindow.iCount.get());
			System.out.println(window.getName()+"��"+SaleTicketWindow.iCount+"���ο͵ȴ���Ʊ....");
			notify();//������Ʊ�̡߳�
			
		}
		else
		{
			System.out.println(window.getName()+"���ڶ����Ѿ��������ȴ�"+window.getName()+"������Ʊ...");
			try
			{
			   wait();
			}
			catch(Exception ex)
			{
		      ex.printStackTrace();
			}
		}
	}
	
	//��Ʊ�ķ���
	public synchronized void saleTicket()
	{
		if(window.getLength()>0)
		{
			int temp = window.remove();
			System.out.println(window.getName()+"�����˵�"+temp+"��Ʊ....");
			saleNum.getAndIncrement();
			notify();//������Ʊ�̡߳�
		}
		else
		{
			System.out.println(window.getName()+"���ڶ���Ϊ�գ��ȴ�"+window.getName()+"�����ο��Ŷ���Ʊ...");
			try
			{
			   wait();
			}
			catch(Exception ex)
			{
		      //ex.printStackTrace();
			}
		}
	}
	
	public int getSaleNum()
	{
		return this.saleNum.get();
	}
}

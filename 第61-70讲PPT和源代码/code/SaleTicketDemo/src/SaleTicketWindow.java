import java.util.concurrent.atomic.AtomicInteger;

//售票窗口类
public class SaleTicketWindow {

	private Window window;
	public static final int MAX_NUM=1000;//每天10000张票
	public static AtomicInteger iCount= new AtomicInteger(0);//售票的总数量。
	private AtomicInteger saleNum = new AtomicInteger(0);//每个窗口的售票数量;
	
	public SaleTicketWindow(Window window)
	{
		this.window = window;
	}
	
	public Window getWindow()
	{
		return this.window;
	}
	
	//排队买票的方法
	public synchronized void buyTicket()
	{
		if(window.getLength()<Window.MAX_LEN)
		{
			if(SaleTicketWindow.iCount.get()>=SaleTicketWindow.MAX_NUM) //票已经卖完了
			{
				notify(); //唤醒售票窗口
				return ;
			}
			SaleTicketWindow.iCount.getAndIncrement();
			window.insert(SaleTicketWindow.iCount.get());
			System.out.println(window.getName()+"第"+SaleTicketWindow.iCount+"个游客等待买票....");
			notify();//唤醒售票线程。
			
		}
		else
		{
			System.out.println(window.getName()+"窗口队伍已经排满，等待"+window.getName()+"窗口售票...");
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
	
	//售票的方法
	public synchronized void saleTicket()
	{
		if(window.getLength()>0)
		{
			int temp = window.remove();
			System.out.println(window.getName()+"卖掉了第"+temp+"张票....");
			saleNum.getAndIncrement();
			notify();//唤醒买票线程。
		}
		else
		{
			System.out.println(window.getName()+"窗口队伍为空，等待"+window.getName()+"窗口游客排队买票...");
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

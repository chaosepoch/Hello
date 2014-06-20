//生产者，游客排队买票
public class Productor implements Runnable {

	private SaleTicketWindow saleWindow;
	
	public Productor(SaleTicketWindow saleWindow)
	{
		this.saleWindow = saleWindow;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		   if(SaleTicketWindow.iCount.get()>=SaleTicketWindow.MAX_NUM)
		   {
			   break;
		   }
		   try
		   {
			   saleWindow.buyTicket();
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		}
		System.out.println("今天的"+SaleTicketWindow.MAX_NUM+"张票卖了完，不用排队买票了....");
	}
	
	
}

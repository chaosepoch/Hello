//消费者，售票窗口
public class Consumer implements Runnable {

    private SaleTicketWindow saleWindow;
	
	public Consumer(SaleTicketWindow saleWindow)
	{
		this.saleWindow = saleWindow;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
		   if(SaleTicketWindow.iCount.get()>=SaleTicketWindow.MAX_NUM&&saleWindow.getWindow().getLength()<=0)
		   {
			   break;
		   }
		   try
		   {
			   saleWindow.saleTicket();
		   }
		   catch(Exception ex)
		   {
			   //ex.printStackTrace();
		   }
		}
		//System.out.println("今天的"+SaleTicketWindow.MAX_NUM+"张票卖了完，不用排队买票了....");
	}
	
}

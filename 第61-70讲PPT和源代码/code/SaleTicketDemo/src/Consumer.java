//�����ߣ���Ʊ����
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
		//System.out.println("�����"+SaleTicketWindow.MAX_NUM+"��Ʊ�����꣬�����Ŷ���Ʊ��....");
	}
	
}

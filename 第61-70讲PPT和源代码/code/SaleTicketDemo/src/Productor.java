//�����ߣ��ο��Ŷ���Ʊ
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
		System.out.println("�����"+SaleTicketWindow.MAX_NUM+"��Ʊ�����꣬�����Ŷ���Ʊ��....");
	}
	
	
}

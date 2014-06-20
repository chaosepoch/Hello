//消费者
public class Consumer implements Runnable{

private Kitchen kitchen;//厨房对象
	
	public Consumer(Kitchen kitchen)
	{
		this.kitchen = kitchen;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			//如何结束消费者的线程
			if(Kitchen.iCount>100&&Brake.BRAKE_NUM<=0)
			{
				break;
			}
			
			try
			{
				kitchen.eat();//不停的吃面包。。。
				//为了让程序看清楚，每吃一个面包休眠100毫秒
				Thread.sleep(500);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	
}

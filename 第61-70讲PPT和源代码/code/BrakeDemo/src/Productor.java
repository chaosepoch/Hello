//生产者类
public class Productor implements Runnable{

	private Kitchen kitchen;//厨房对象
	
	public Productor(Kitchen kitchen)
	{
		this.kitchen = kitchen;
	}

	@Override
	public void run() {
		
		while(true)
		{
		   //如何结束这个线程
		   if(Kitchen.iCount>100)  //一百个面包都做完了,则结束生产者线程
		   {
			   break;
		   }
		   
		   try
		   {
			  kitchen.make();//妈妈不断地做面包。
			  //为了让程序看清楚，每做一个面包休眠100毫秒
			  Thread.sleep(100);
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		}
		System.out.println("一百个面包做完了，妈妈明年继续做面包。");
		
	}
}

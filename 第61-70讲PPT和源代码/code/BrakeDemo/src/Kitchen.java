//厨房类
public class Kitchen {

	private Brake brake;
	public static int bigNum=0;//大林吃的数量;
	public static int smallNum=0;//小林吃的数量;
	public static int TOTOAL_NUM=100;//一共做一百个面包
	public static int iCount=1;//计数器，统计做过的面包的个数。
	
	
	public Kitchen(Brake brake)
	{
		this.brake = brake;
	}
	
	//做厨房面包的方法
	public synchronized void make()
	{
		//首先判断锅是否已满
		if(Brake.BRAKE_NUM<10)//锅还未满
		{
			brake.insert(Kitchen.iCount);
			System.out.println("妈妈做完了第"+Kitchen.iCount+"个面包。");
			Kitchen.iCount++;
			notifyAll();//唤醒儿子吃面包。
		}
		else
		{
			System.out.println("锅已经装满，等待儿子吃面包....");
			try
			{
			   wait(); //进入阻塞状态，等待消费者线程的唤醒.
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	//吃面包的方法
	public synchronized void eat()
	{
		//首先判断锅是否是空的。
		if(Brake.BRAKE_NUM>0)
		{
			int temp = brake.remove(); //获得吃掉的面包的编号
			System.out.println(Thread.currentThread().getName()+"吃掉了第"+temp+"个面包。");
			if(Thread.currentThread().getName().equals("大林"))
			{
				bigNum++;
			}
			else
			{
				smallNum++;
			}
			notifyAll();//唤醒妈妈继续做面包
		}
		else
		{
			System.out.println("面包吃完了，等待妈妈做面包....");
			try
			{
			   wait(); //进入阻塞状态，等待生产者者线程的唤醒.
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
}

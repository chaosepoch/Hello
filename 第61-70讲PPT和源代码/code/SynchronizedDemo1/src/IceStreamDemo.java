/* 妈妈有两个孩子，分别是大林和小林。
 * 
 * 暑假妈妈买了50根冰棍放进冰箱。大林和小林每天放学回家都吃冰棍。
 * 
 * 使用java多线程来描述上述问题，统计大林和小林各吃了多少根冰棍。
 * 
 * 
 * */

class IceStream implements Runnable
{

	private int iceStreamNum;//冰棍的数量
	public int bigNum=0;//大林吃的数量
	public int smallNum=0;//小林吃的数量
	public boolean flag = true;//控制线程是否结束的开关变量
	
	public IceStream(int iceStreamNum)
	{
		this.iceStreamNum = iceStreamNum;
	}
	
	//吃冰棍方法
	public synchronized void eatIceStream() throws Exception
	{
		if(iceStreamNum<=0) //如果冰棍的数量小于等于0，则退出
		{
			flag = false;
			return ;
		}
		iceStreamNum--;
		if(Thread.currentThread().getName().equals("大林"))
		{
			bigNum++;
			System.out.println("大林吃了一根冰棍，还剩"+iceStreamNum+"根。");
			Thread.sleep(200);
		}
		else
		{
			smallNum++;
			System.out.println("小林吃了一根冰棍，还剩"+iceStreamNum+"根。");
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
				eatIceStream();//不停的吃冰棍
			}
			catch(Exception ex)
			{
				
			}
		}
	}
   
    //统计各吃了多少根
	public void showResult()
	{
		System.out.println("大林吃了："+bigNum+"根.");
		System.out.println("小林吃了："+smallNum+"根.");
	}
}

public class IceStreamDemo {

	public static void main(String[] args) {
		
		IceStream ic = new IceStream(50);
		Thread bigSon = new Thread(ic,"大林");
		Thread smallSon = new Thread(ic,"小林");
		
		bigSon.start();
		smallSon.start();
		//等待线程结束，统计结果
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

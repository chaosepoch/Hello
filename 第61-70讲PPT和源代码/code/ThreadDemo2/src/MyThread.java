
public class MyThread extends Thread {

	public MyThread()
	{
		super();
	}
	
	public MyThread(String name)
	{
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //ÐÝÃß0.1Ãë
		}
	}

	
}

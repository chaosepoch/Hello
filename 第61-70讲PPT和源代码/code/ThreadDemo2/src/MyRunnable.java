
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+":"+i);
			/*
			if(Thread.currentThread().getName().equals("MyThread"))
			{
				Thread.yield();//主动放弃CPU的使用权利。
			}*/
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("出现中断异常，休眠结束....");
			} //休眠0.1秒
		}
	}

}

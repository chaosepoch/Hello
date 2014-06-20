
public class Test {

	public static void main(String[] args) {
	
		MyThread th = new MyThread();
		MyThread2 r = new MyThread2();
		
		Thread th2 = new Thread(r);
		
		th.start(); //启动一个线程
		th2.start();//启动另一个线程
		
		//th.run();
		
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

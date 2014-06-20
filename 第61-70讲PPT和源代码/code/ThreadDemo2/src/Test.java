
public class Test {

	public static void main(String[] args) {
		/*
		Thread th1 = new MyThread();
		Thread th2 = new MyThread("MyThread");
		th1.start();
		th2.start();*/
		
	    MyRunnable run1 = new MyRunnable();
	    MyRunnable run2 = new MyRunnable();
	    Thread th3 = new Thread(run1);
	    Thread th4 = new Thread(run2,"MyThread");
	    //获得线程的优先级别
	    //System.out.println(th3.getPriority());
	    //System.out.println(th4.getPriority());
	    //设置线程的有线级别
	    //th3.setPriority(1);
	    //th4.setPriority(Thread.MAX_PRIORITY);
	    th3.setPriority(Thread.NORM_PRIORITY);
	    th4.setPriority(Thread.NORM_PRIORITY);
	    
	    System.out.println(th3.getPriority());
	    System.out.println(th4.getPriority());
	    th3.setDaemon(true);//设置为守护线程。
	    
	    th4.start();
	    th3.start();
	    
	    System.out.println("------------------");
	    System.out.println("th3线程是否活动："+th3.isAlive());
	    System.out.println("th4线程是否活动："+th4.isAlive());
	    
	    //th3.setDaemon(true);//设置为守护线程。必须在启动之前设置
	    System.out.println("th3线程是否是守护线程："+th3.isDaemon());
	    System.out.println("th4线程是否是守护线程："+th4.isDaemon());
	    
	    System.out.println("th3线程的状态："+th3.getState());
	    System.out.println("th4线程的状态："+th4.getState());
	    
	    /*
	    try {
			th4.join(); //等待th4线程的结束
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	    
	    for(int i=0;i<20;i++)
	    {
	    	System.out.println(Thread.currentThread().getId()+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //休眠0.1秒
	    }
	    th3.interrupt();//注意：不要误以为interrupt()是结束一个线程，而是中断一个线程。
	    
	    System.out.println("--------main方法循环执行完---------");
	    System.out.println("th3线程的状态："+th3.getState());
	    System.out.println("th4线程的状态："+th4.getState());
	    
	}

}

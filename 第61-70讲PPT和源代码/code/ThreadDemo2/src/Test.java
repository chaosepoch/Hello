
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
	    //����̵߳����ȼ���
	    //System.out.println(th3.getPriority());
	    //System.out.println(th4.getPriority());
	    //�����̵߳����߼���
	    //th3.setPriority(1);
	    //th4.setPriority(Thread.MAX_PRIORITY);
	    th3.setPriority(Thread.NORM_PRIORITY);
	    th4.setPriority(Thread.NORM_PRIORITY);
	    
	    System.out.println(th3.getPriority());
	    System.out.println(th4.getPriority());
	    th3.setDaemon(true);//����Ϊ�ػ��̡߳�
	    
	    th4.start();
	    th3.start();
	    
	    System.out.println("------------------");
	    System.out.println("th3�߳��Ƿ���"+th3.isAlive());
	    System.out.println("th4�߳��Ƿ���"+th4.isAlive());
	    
	    //th3.setDaemon(true);//����Ϊ�ػ��̡߳�����������֮ǰ����
	    System.out.println("th3�߳��Ƿ����ػ��̣߳�"+th3.isDaemon());
	    System.out.println("th4�߳��Ƿ����ػ��̣߳�"+th4.isDaemon());
	    
	    System.out.println("th3�̵߳�״̬��"+th3.getState());
	    System.out.println("th4�̵߳�״̬��"+th4.getState());
	    
	    /*
	    try {
			th4.join(); //�ȴ�th4�̵߳Ľ���
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
			} //����0.1��
	    }
	    th3.interrupt();//ע�⣺��Ҫ����Ϊinterrupt()�ǽ���һ���̣߳������ж�һ���̡߳�
	    
	    System.out.println("--------main����ѭ��ִ����---------");
	    System.out.println("th3�̵߳�״̬��"+th3.getState());
	    System.out.println("th4�̵߳�״̬��"+th4.getState());
	    
	}

}

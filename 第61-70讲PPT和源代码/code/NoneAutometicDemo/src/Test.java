import java.util.concurrent.atomic.AtomicInteger;

class A
{
   //public static int num=0;	
   public static AtomicInteger num = new AtomicInteger(0);

}

class MyThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++)
		{
			//A.num++;
			A.num.getAndIncrement();//先获得再加一、
		}
	}
    

}


public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyThread r1 = new MyThread();
         MyThread r2 = new MyThread();
         MyThread r3 = new MyThread();
         
         Thread th1 = new Thread(r1);
         Thread th2 = new Thread(r2);
         Thread th3 = new Thread(r3);
         
         //启动三个线程，分别对A.num进行自增运算
         th1.start();
         th2.start();
         th3.start();
         
         //必须等待三个线程结束打印结果
         try
         {
        	 th1.join();
        	 th2.join();
        	 th3.join();
         }
         catch(Exception ex)
         {
        	 ex.printStackTrace();
         }
         
         System.out.println("A.num="+A.num);
         
         
	}

}

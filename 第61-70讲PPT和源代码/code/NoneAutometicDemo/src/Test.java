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
			A.num.getAndIncrement();//�Ȼ���ټ�һ��
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
         
         //���������̣߳��ֱ��A.num������������
         th1.start();
         th2.start();
         th3.start();
         
         //����ȴ������߳̽�����ӡ���
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


public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //三个窗口对象	
       Window a = new Window("A");
       Window b = new Window("B");
       Window c = new Window("C");
       
       //三个售票窗口对象
       SaleTicketWindow sw1 = new SaleTicketWindow(a);
       SaleTicketWindow sw2 = new SaleTicketWindow(b);
       SaleTicketWindow sw3 = new SaleTicketWindow(c);
       
       //三个生产者对象
       Productor p1 = new Productor(sw1);
       Productor p2 = new Productor(sw2);
       Productor p3 = new Productor(sw3);
       
       //三个消费者对象
       Consumer c1 = new Consumer(sw1);
       Consumer c2 = new Consumer(sw2);
       Consumer c3 = new Consumer(sw3);
       
       //三个生产者线程
       Thread p_th1 = new Thread(p1);
       Thread p_th2 = new Thread(p2);
       Thread p_th3 = new Thread(p3);
       
       //三个消费者线程
       Thread c_th1 = new Thread(c1);
       Thread c_th2 = new Thread(c2);
       Thread c_th3 = new Thread(c3);
       
       p_th1.start();
       p_th2.start();
       p_th3.start();
       
       c_th1.start();
       c_th2.start();
       c_th3.start();
       
       try
       {
    	   p_th1.join();
           p_th2.join();
           p_th3.join();
           
           //为了避免死锁，让生产者线程结束后，打断消费者线程的休眠状态，让消费者线程继续执行，结束消费者线程
           if(!p_th1.isAlive())
           {
        	   c_th1.interrupt();//打断消费者线程的休眠
           }
           if(!p_th2.isAlive())
           {
        	   c_th2.interrupt();//打断消费者线程的休眠
           }
           if(!p_th3.isAlive())
           {
        	   c_th3.interrupt();//打断消费者线程的休眠
           }
           
           c_th1.join();
           c_th2.join();
           c_th3.join();   
       }
       catch(Exception ex)
       {
    	   ex.printStackTrace();
       }
       
       System.out.println("------------------------------");
       System.out.println("A窗口买了："+sw1.getSaleNum());
       System.out.println("B窗口买了："+sw2.getSaleNum());
       System.out.println("C窗口买了："+sw3.getSaleNum());
         
	}

}

/*
 * 张三、李四合租了一间房间，早上张三先起床进入卫生间刷牙，然后李四
 * 后起床，在门口等待。张三刷完牙出来，李四进入卫生间刷牙，张三在门口等待小便。
 * 李四刷完牙，张三进入卫生间小便，李四在门口等待。张三小便完，李四进入卫生间小便。
 * 
 * 如何使用java的多线程的同步机制来描述上述情形。
 * 
 * */

class MyRoomThread extends Thread
{
   static MyRoomThread zhangsan = new MyRoomThread("张三") ; //张三
   static MyRoomThread lisi = new MyRoomThread("李四"); //李四
   private String name;//住户的名字
   static Object toliet = new Object(); //卫生间
   
   MyRoomThread(String name)
   {
	   this.name = name;
   }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			synchronized(toliet) //只有获得卫生间的锁，才能使用卫生间的临界资源，比如：马桶、洗脸盆
			{
				if(this.name.equals("张三"))
				{
					this.brush();//张三先刷牙;
					toliet.wait();//张三释放卫生间的锁，张三在门口等待小便
					this.release();//李四刷完牙，张三小便。
					toliet.notify();//释放对象的锁，让李四小便。
				}
				else{
					this.brush();
					toliet.notify();//释放卫生间的锁，让张三小便
					toliet.wait();//李四在门口等待小便
					this.release();
				}
				
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
    //刷牙的方法
	public void brush() throws Exception
	{
		System.out.println(this.name+"正在刷牙ing....");
		Thread.sleep(2000);
		System.out.println(this.name+"刷牙完毕离开....");
	}
   
	//解小便的方法
	public void release() throws Exception
	{
		System.out.println(this.name+"正在小便ing....");
		Thread.sleep(2000);
		System.out.println(this.name+"小便完毕离开....");
	}
}


public class MyThreadDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyRoomThread.zhangsan.start();//张三先上卫生间
        MyRoomThread.lisi.start();//李四后上卫生间
	}

}

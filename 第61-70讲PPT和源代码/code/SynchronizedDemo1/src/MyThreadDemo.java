/*
 * ���������ĺ�����һ�䷿�䣬�����������𴲽���������ˢ����Ȼ������
 * ���𴲣����ſڵȴ�������ˢ�������������Ľ���������ˢ�����������ſڵȴ�С�㡣
 * ����ˢ��������������������С�㣬�������ſڵȴ�������С���꣬���Ľ���������С�㡣
 * 
 * ���ʹ��java�Ķ��̵߳�ͬ�������������������Ρ�
 * 
 * */

class MyRoomThread extends Thread
{
   static MyRoomThread zhangsan = new MyRoomThread("����") ; //����
   static MyRoomThread lisi = new MyRoomThread("����"); //����
   private String name;//ס��������
   static Object toliet = new Object(); //������
   
   MyRoomThread(String name)
   {
	   this.name = name;
   }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			synchronized(toliet) //ֻ�л�����������������ʹ����������ٽ���Դ�����磺��Ͱ��ϴ����
			{
				if(this.name.equals("����"))
				{
					this.brush();//������ˢ��;
					toliet.wait();//�����ͷ�������������������ſڵȴ�С��
					this.release();//����ˢ����������С�㡣
					toliet.notify();//�ͷŶ��������������С�㡣
				}
				else{
					this.brush();
					toliet.notify();//�ͷ������������������С��
					toliet.wait();//�������ſڵȴ�С��
					this.release();
				}
				
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
    //ˢ���ķ���
	public void brush() throws Exception
	{
		System.out.println(this.name+"����ˢ��ing....");
		Thread.sleep(2000);
		System.out.println(this.name+"ˢ������뿪....");
	}
   
	//��С��ķ���
	public void release() throws Exception
	{
		System.out.println(this.name+"����С��ing....");
		Thread.sleep(2000);
		System.out.println(this.name+"С������뿪....");
	}
}


public class MyThreadDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyRoomThread.zhangsan.start();//��������������
        MyRoomThread.lisi.start();//���ĺ���������
	}

}

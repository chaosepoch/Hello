import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//管道流小例子
class MyReader implements Runnable
{
	private PipedInputStream pin;

	public MyReader(PipedInputStream pin)
	{
		this.pin = pin;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//每次读取一个字节
		int temp;
		try
		{
			while((temp=pin.read())!=-1)
			{
				System.out.print((char)temp);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}

class MyWriter implements Runnable
{
	private PipedOutputStream pout;

	public MyWriter(PipedOutputStream pout)
	{
		this.pout = pout;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("等待三秒开始写入数据....");
		try
		{
		   Thread.sleep(3000);
		   //String s = "Hello World!";
		   String s = "你好，中国！";
		   pout.write(s.getBytes());
		   pout.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
public class PipedStreamDemo {
	
	public static void main(String[] args) {
		
		try
		{
		  PipedOutputStream pout=new PipedOutputStream();
		  PipedInputStream pin = new PipedInputStream(pout);
		  MyReader r = new MyReader(pin);
		  MyWriter w = new MyWriter(pout);
		  
		  Thread th_r = new Thread(r);
		  Thread th_w = new Thread(w);
		  
		  th_r.start();
		  th_w.start();
		  
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}

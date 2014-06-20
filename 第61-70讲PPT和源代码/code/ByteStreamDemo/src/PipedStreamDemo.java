import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//�ܵ���С����
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
		//ÿ�ζ�ȡһ���ֽ�
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
		System.out.println("�ȴ����뿪ʼд������....");
		try
		{
		   Thread.sleep(3000);
		   //String s = "Hello World!";
		   String s = "��ã��й���";
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

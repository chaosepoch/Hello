import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//����������Ӧ�߳���

public class EchoThread implements Runnable {

	private Socket client; //�ͻ��˶���
	
	public EchoThread(Socket client)
	{
		this.client = client;
	}
	
	@Override
	public void run() {
		//������ܴӿͻ��˴������ַ��������ַ����ٻ�д���ͻ��ˡ��������һ�������Է���
        try
        {
		    //�����ȡ�ӿͻ��˷��͹������ַ���,��Ϊ��ȡ�����ַ���������Ӧ��ʹ���ַ�����BufferedReader
        	BufferedReader buff = new BufferedReader(new InputStreamReader(client.getInputStream())); 		
	        PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true;
            while(flag)
            {
            	String msg = buff.readLine();
            	if(msg==null||msg.equalsIgnoreCase("bye"))
            	{
            		flag = false; //�����߳�
            	}
            	else
            	{
            		//�Ͱѽ��ܵ����ַ�����д���ͻ���
            		out.println("ECHO:"+msg);
            	}
            }
            //buff.close();
            client.close();
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	
	}

	
}

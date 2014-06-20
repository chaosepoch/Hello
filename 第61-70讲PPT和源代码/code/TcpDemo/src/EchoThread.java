import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//服务器端响应线程类

public class EchoThread implements Runnable {

	private Socket client; //客户端对象
	
	public EchoThread(Socket client)
	{
		this.client = client;
	}
	
	@Override
	public void run() {
		//负责接受从客户端传来的字符串，把字符串再会写给客户端。就像回声一样传给对方。
        try
        {
		    //负责读取从客户端发送过来的字符串,因为读取的是字符串，所有应该使用字符流。BufferedReader
        	BufferedReader buff = new BufferedReader(new InputStreamReader(client.getInputStream())); 		
	        PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true;
            while(flag)
            {
            	String msg = buff.readLine();
            	if(msg==null||msg.equalsIgnoreCase("bye"))
            	{
            		flag = false; //结束线程
            	}
            	else
            	{
            		//就把接受到的字符串回写给客户端
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

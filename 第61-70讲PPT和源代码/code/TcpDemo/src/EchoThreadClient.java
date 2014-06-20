import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//客户端
public class EchoThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 //创建和服务器的一个连接
             Socket client = new Socket("localhost",9999);
			 BufferedReader buff=null ;//负责从服务器端读取回写的字符串
			 BufferedReader input=null; //负责读取从控制台输入的字符串
			 PrintStream output = null;//负责在屏幕输出回写的字符串。
			 buff = new BufferedReader(new InputStreamReader(client.getInputStream()));
			 input = new BufferedReader(new InputStreamReader(System.in));
			 output = new PrintStream(client.getOutputStream());
			 
			 boolean flag = true;
			 while(flag)
			 {
				 System.out.println("请输入信息：");
				 String msg = input.readLine();
				 if(msg==null||msg.equalsIgnoreCase("bye"))
				 {
					 flag = false;
				 }
				 else
				 {
					output.println(msg); //输出给服务器
					//获得服务器回写的字符串
					String echo = buff.readLine();
					System.out.println(echo);
				 }
			 }
			 buff.close();
			 client.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

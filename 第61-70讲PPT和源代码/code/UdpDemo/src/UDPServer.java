import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//服务器端
public class UDPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//创建监听套接字对象
			DatagramSocket ds = new DatagramSocket(7777);
			//创建一个字节缓冲区
			String msg = "你好，来自服务器的问候...";
			//创建要发送的数据包对象
			DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,InetAddress.getByName("localhost"),9999);
		    
			ds.send(dp);
		    System.out.println("信息已经发送...");
		    ds.close();
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}

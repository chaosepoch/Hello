import java.net.DatagramPacket;
import java.net.DatagramSocket;

//客户端
public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//创建监听套接字对象
			DatagramSocket ds = new DatagramSocket(9999);
			
			//创建缓冲区
			byte[] buff = new byte[1024];
			//创建用来接收的数据包
			DatagramPacket dp = new DatagramPacket(buff,buff.length);
			ds.receive(dp);
			
			ds.close();
			
			System.out.println(new String(dp.getData(),0,dp.getLength())+"-->From:"+dp.getAddress().getHostAddress()+":"+dp.getPort()+",长度："+dp.getLength()+"byte");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

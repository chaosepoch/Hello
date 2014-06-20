import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class EchoThreadServer {

	public static void main(String[] args) {
		
		try
		{
			//服务器对象
			ServerSocket server = new ServerSocket(9999);
			//客户端对象
			Socket client=null;
			boolean flag = true;
			while(flag)
			{
				System.out.println("服务器已经启动，等待客户端的请求....");
				client = server.accept(); //注意这里是阻塞方法
				//生成一个响应线程，每一个客户端对应一个响应线程
				new Thread(new EchoThread(client)).start();
			}
			server.close();
			System.out.println("服务器已经关闭！");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

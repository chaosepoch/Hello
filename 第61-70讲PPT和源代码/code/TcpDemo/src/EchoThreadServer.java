import java.net.ServerSocket;
import java.net.Socket;

//��������
public class EchoThreadServer {

	public static void main(String[] args) {
		
		try
		{
			//����������
			ServerSocket server = new ServerSocket(9999);
			//�ͻ��˶���
			Socket client=null;
			boolean flag = true;
			while(flag)
			{
				System.out.println("�������Ѿ��������ȴ��ͻ��˵�����....");
				client = server.accept(); //ע����������������
				//����һ����Ӧ�̣߳�ÿһ���ͻ��˶�Ӧһ����Ӧ�߳�
				new Thread(new EchoThread(client)).start();
			}
			server.close();
			System.out.println("�������Ѿ��رգ�");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

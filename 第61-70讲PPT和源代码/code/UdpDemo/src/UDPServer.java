import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//��������
public class UDPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//���������׽��ֶ���
			DatagramSocket ds = new DatagramSocket(7777);
			//����һ���ֽڻ�����
			String msg = "��ã����Է��������ʺ�...";
			//����Ҫ���͵����ݰ�����
			DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,InetAddress.getByName("localhost"),9999);
		    
			ds.send(dp);
		    System.out.println("��Ϣ�Ѿ�����...");
		    ds.close();
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}

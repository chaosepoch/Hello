import java.net.DatagramPacket;
import java.net.DatagramSocket;

//�ͻ���
public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//���������׽��ֶ���
			DatagramSocket ds = new DatagramSocket(9999);
			
			//����������
			byte[] buff = new byte[1024];
			//�����������յ����ݰ�
			DatagramPacket dp = new DatagramPacket(buff,buff.length);
			ds.receive(dp);
			
			ds.close();
			
			System.out.println(new String(dp.getData(),0,dp.getLength())+"-->From:"+dp.getAddress().getHostAddress()+":"+dp.getPort()+",���ȣ�"+dp.getLength()+"byte");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

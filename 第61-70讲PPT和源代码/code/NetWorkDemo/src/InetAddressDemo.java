import java.net.InetAddress;


public class InetAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  //��ñ����ķ�������ַ
    	  InetAddress ip = InetAddress.getLocalHost();
    	  
    	  System.out.println("�����������ĵ�ַ��"+ip.getHostAddress());
    	  System.out.println("���������������֣�"+ip.getHostName());
    	  //System.out.println("�����������ĵ�ַ��"+ip.getAddress());
          byte[] address = ip.getAddress();
          for(int i=0;i<address.length;i++)
          {
        	  System.out.print(address[i]+" ");
          }
          System.out.println("\n���������Ƿ�ɵ��"+ip.isReachable(5000));
          System.out.println("��û�·��ַ��"+ip.getLoopbackAddress());
          //�����������iP��ַ
          System.out.println("�����������IP��ַ��"+InetAddress.getByName("www.sina.com.cn").getHostAddress());
          
      }
      catch(Exception ex)
      {
    	  ex.printStackTrace();
      }
	}

}

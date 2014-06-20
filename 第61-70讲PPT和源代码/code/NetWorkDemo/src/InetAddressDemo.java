import java.net.InetAddress;


public class InetAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  //获得本机的服务器地址
    	  InetAddress ip = InetAddress.getLocalHost();
    	  
    	  System.out.println("本机服务器的地址："+ip.getHostAddress());
    	  System.out.println("本机服务器的名字："+ip.getHostName());
    	  //System.out.println("本机服务器的地址："+ip.getAddress());
          byte[] address = ip.getAddress();
          for(int i=0;i<address.length;i++)
          {
        	  System.out.print(address[i]+" ");
          }
          System.out.println("\n本地主机是否可到达："+ip.isReachable(5000));
          System.out.println("获得回路地址："+ip.getLoopbackAddress());
          //获得新浪网的iP地址
          System.out.println("获得新浪网的IP地址："+InetAddress.getByName("www.sina.com.cn").getHostAddress());
          
      }
      catch(Exception ex)
      {
    	  ex.printStackTrace();
      }
	}

}

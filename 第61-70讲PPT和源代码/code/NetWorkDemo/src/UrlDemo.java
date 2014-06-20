import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class UrlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	URL url = new URL("http://www.sina.com.cn");
        	URLConnection conn = url.openConnection();
        	if(conn!=null)
        	{
        		System.out.println("正常连接到新浪网！");
        	}
        	else
        	{
        		System.out.println("连接失败！");
        	}
        	System.out.println("数据包的长度："+conn.getContentLength());
        	System.out.println("数据包的类型："+conn.getContentType());
        	System.out.println("数据包的字符编码："+conn.getContentEncoding());
        	InputStream in =  url.openStream();
        	Scanner scanner = new Scanner(in);
        	scanner.useDelimiter("\n"); //设置换行回车为分隔符
        	while(scanner.hasNext())
        	{
        		System.out.println(scanner.next());
        	}
        	scanner.close();
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}

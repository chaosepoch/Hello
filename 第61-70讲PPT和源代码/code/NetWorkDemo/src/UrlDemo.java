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
        		System.out.println("�������ӵ���������");
        	}
        	else
        	{
        		System.out.println("����ʧ�ܣ�");
        	}
        	System.out.println("���ݰ��ĳ��ȣ�"+conn.getContentLength());
        	System.out.println("���ݰ������ͣ�"+conn.getContentType());
        	System.out.println("���ݰ����ַ����룺"+conn.getContentEncoding());
        	InputStream in =  url.openStream();
        	Scanner scanner = new Scanner(in);
        	scanner.useDelimiter("\n"); //���û��лس�Ϊ�ָ���
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

import java.net.URLDecoder;
import java.net.URLEncoder;


public class UrlEncodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	String s = "�й�";
        	//����UTF-8���б��롣
        	System.out.println(URLEncoder.encode(s,"utf-8"));
        	//����UTF-8���н���
        	System.out.println(URLDecoder.decode(s,"utf-8"));
        	System.out.println("\u4e2d\u56fd");
        	
        	//'��'�ֵ�unicode�����ǣ�4e2d
        	//'��'�ְ���utf-8���뱣�����������ļ���ռ�������ֽڣ��������ֽڵı��� E4B8AD ;
        }
        catch(Exception ex)
        {
        	
        }
        
	}

}

import java.net.URLDecoder;
import java.net.URLEncoder;


public class UrlEncodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	String s = "中国";
        	//按照UTF-8进行编码。
        	System.out.println(URLEncoder.encode(s,"utf-8"));
        	//按照UTF-8进行解密
        	System.out.println(URLDecoder.decode(s,"utf-8"));
        	System.out.println("\u4e2d\u56fd");
        	
        	//'中'字的unicode编码是：4e2d
        	//'中'字按照utf-8编码保存在流或者文件，占用三个字节，这三个字节的编码 E4B8AD ;
        }
        catch(Exception ex)
        {
        	
        }
        
	}

}

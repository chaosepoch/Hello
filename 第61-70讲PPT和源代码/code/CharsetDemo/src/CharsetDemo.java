import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//JAVA字符编码实例
public class CharsetDemo {
	//使用JAVA的字节流来读取文本文件
	public static void main(String[] args) {
      
		File file = new File("c:"+File.separator+"readme.txt");
		InputStream in=null;
		
		try
		{
		   in = new FileInputStream(file);	
		   byte[] buff = new byte[(int)file.length()];
		   int len=0;
		   String s="";
		   while((len=in.read(buff))!=-1)
		   {
			   //s+=new String(buff); //先使用默认的字符编码
		       s+=new String(buff,"utf-8");
		   }
		   System.out.print(s);;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

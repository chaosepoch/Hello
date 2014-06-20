import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileStreamDemo {
	
	//使用文件流把一首唐诗写入文本文件中
	public static void main(String[] args) {

		String s ="床前明月光\r\n疑是地上霜\r\n举头望明月\r\n我是郭德纲\r\n";
		File file = new File("c:"+File.separator+"test.txt");
		OutputStream out=null;
		InputStream in = null;
		try
		{
	       	out = new FileOutputStream(file);
	       	in = new FileInputStream(file);
	       	out.write(s.getBytes());//把字符串转换为字节数组，写入文件.
		    //通过这个例子说明，字节流默认是不使用缓冲区的。
	       	out.close();
		    //写完了之后读取文件
		    byte[] buf = new byte[(int)file.length()];
		    in.read(buf);//把文件内容读入缓冲区
		    String temp = new String(buf);
		    System.out.print(temp);
		    in.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}

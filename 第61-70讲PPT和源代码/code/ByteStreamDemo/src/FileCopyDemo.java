import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 使用文件流实现文件拷贝的小例子
 * */
public class FileCopyDemo {
	public static void main(String[] args) {
        //源文件
		File src = new File("c:"+File.separator+"haha"+File.separator+"src.jpg");
		//目标文件
		File des = new File("c:"+File.separator+"haha"+File.separator+"des.jpg");
		InputStream in=null;
		OutputStream out=null;
		
		try
		{
		   in = new FileInputStream(src);
		   out = new FileOutputStream(des);
		   //读取源文件
		   byte[] buff = new byte[1024]; //缓冲区
		   int temp;//获取每次实际读取的字节的个数
		   while((temp=in.read(buff))!=-1) //判断是否读到文件的结尾
		   {
			   out.write(buff);
		   }
		}
		catch(Exception ex)
		{
	        ex.printStackTrace();		
		}
		finally
		{
			try
			{
			  in.close();
			  out.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}

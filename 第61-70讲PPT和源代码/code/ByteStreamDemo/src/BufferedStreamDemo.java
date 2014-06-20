import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用缓冲流实现文件的拷贝
 * */

public class BufferedStreamDemo {

	
	public static void main(String[] args) {
        //源文件
		File src = new File("c:"+File.separator+"haha"+File.separator+"src.jpg");
		//目标文件
		File des = new File("c:"+File.separator+"haha"+File.separator+"des.jpg");
		BufferedInputStream bin=null;
		BufferedOutputStream bout=null;
		
		try
		{
		   bin =new BufferedInputStream(new FileInputStream(src));
		   bout =new BufferedOutputStream(new FileOutputStream(des));
		   //读取源文件
		   byte[] buff = new byte[1024]; //缓冲区
		   int temp;//获取每次实际读取的字节的个数
		   while((temp=bin.read(buff))!=-1) //判断是否读到文件的结尾
		   {
			   bout.write(buff);
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
			  bin.close();
			  bout.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}


}

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ʹ�û�����ʵ���ļ��Ŀ���
 * */

public class BufferedStreamDemo {

	
	public static void main(String[] args) {
        //Դ�ļ�
		File src = new File("c:"+File.separator+"haha"+File.separator+"src.jpg");
		//Ŀ���ļ�
		File des = new File("c:"+File.separator+"haha"+File.separator+"des.jpg");
		BufferedInputStream bin=null;
		BufferedOutputStream bout=null;
		
		try
		{
		   bin =new BufferedInputStream(new FileInputStream(src));
		   bout =new BufferedOutputStream(new FileOutputStream(des));
		   //��ȡԴ�ļ�
		   byte[] buff = new byte[1024]; //������
		   int temp;//��ȡÿ��ʵ�ʶ�ȡ���ֽڵĸ���
		   while((temp=bin.read(buff))!=-1) //�ж��Ƿ�����ļ��Ľ�β
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

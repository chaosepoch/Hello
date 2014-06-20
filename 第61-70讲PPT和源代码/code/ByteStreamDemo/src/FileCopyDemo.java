import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ʹ���ļ���ʵ���ļ�������С����
 * */
public class FileCopyDemo {
	public static void main(String[] args) {
        //Դ�ļ�
		File src = new File("c:"+File.separator+"haha"+File.separator+"src.jpg");
		//Ŀ���ļ�
		File des = new File("c:"+File.separator+"haha"+File.separator+"des.jpg");
		InputStream in=null;
		OutputStream out=null;
		
		try
		{
		   in = new FileInputStream(src);
		   out = new FileOutputStream(des);
		   //��ȡԴ�ļ�
		   byte[] buff = new byte[1024]; //������
		   int temp;//��ȡÿ��ʵ�ʶ�ȡ���ֽڵĸ���
		   while((temp=in.read(buff))!=-1) //�ж��Ƿ�����ļ��Ľ�β
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

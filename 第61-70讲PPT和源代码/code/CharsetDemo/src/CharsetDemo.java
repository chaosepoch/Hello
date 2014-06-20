import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//JAVA�ַ�����ʵ��
public class CharsetDemo {
	//ʹ��JAVA���ֽ�������ȡ�ı��ļ�
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
			   //s+=new String(buff); //��ʹ��Ĭ�ϵ��ַ�����
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

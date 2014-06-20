import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//ʹ��JAVA��ѹ����ʵ�ֶ��ļ��е�ѹ��ʵ��
public class ZipFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Ҫѹ����Ŀ¼
	   File dir = new File("c:"+File.separator+"haha");
       //ѹ������ļ�
	   File zipFile = new File("c:"+File.separator+"haha.zip");
       //���ѹ����
	   ZipOutputStream zout = null;
	   //������,������ȡÿһ��Ҫѹ�����ļ�
	   InputStream in=null;
	   try
	   {
		   //ʵ����ѹ�����������
		   zout = new ZipOutputStream(new FileOutputStream(zipFile));
		  
		   //����Ҫѹ����Ŀ¼  
		   File[] files = dir.listFiles();
	       
		   //д��ѹ���ļ��ı�ע	   
		   zout.setComment("my zip file demo");
		   for(int i=0;i<files.length;i++)
		   {
			   in = new FileInputStream(files[i]);
			   //����һ��ѹ��ʵ�壬ѹ�뵽ѹ���ļ��С�
			   zout.putNextEntry(new ZipEntry(files[i].getName()));
			   int temp=0;
			   while((temp=in.read())!=-1)
			   {
				   zout.write(temp);
			   }
			   in.close();
		   }
		   
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try {
			zout.close();
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
	   }
	}

}

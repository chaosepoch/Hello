import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//ʹ��JAVA��ѹ����ʵ�ֶ�ѹ���ļ��Ľ�ѹʵ��
public class UnzipFileDemo {

	public static void main(String[] args) {
		//Ҫ�������ļ�
	    File zipFile = new File("c:"+File.separator+"haha.zip");
	    //��ѹ���Ŀ¼
	    File dir = new File("c:"+File.separator+"unzip_haha");
	    //�����
	    OutputStream out = null;
	    //ѹ��������
	    ZipInputStream zin = null;
	    
	    try
	    {
	    	if(!dir.exists()) //�����ѹĿ¼�����ڣ��򴴽�Ŀ¼
	    	{
	    		dir.mkdirs();
	    	}
	    	zin = new ZipInputStream(new FileInputStream(zipFile));
	    	ZipEntry entry=null;//ѹ��ʵ�����
	    	while((entry=zin.getNextEntry())!=null)
	    	{
	    		out = new FileOutputStream(new File(dir,entry.getName()));
	    		int temp=0;
	    		while((temp = zin.read())!=-1)
	    		{
	    			out.write(temp);
	    		}
	    		out.close();
	    	}
	    }
	    catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }
	    finally
	    {
	    	try {
				zin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

}

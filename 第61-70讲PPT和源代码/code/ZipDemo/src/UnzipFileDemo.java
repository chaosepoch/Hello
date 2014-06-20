import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//使用JAVA的压缩流实现对压缩文件的解压实例
public class UnzipFileDemo {

	public static void main(String[] args) {
		//要解缩的文件
	    File zipFile = new File("c:"+File.separator+"haha.zip");
	    //解压后的目录
	    File dir = new File("c:"+File.separator+"unzip_haha");
	    //输出流
	    OutputStream out = null;
	    //压缩输入流
	    ZipInputStream zin = null;
	    
	    try
	    {
	    	if(!dir.exists()) //如果解压目录不存在，则创建目录
	    	{
	    		dir.mkdirs();
	    	}
	    	zin = new ZipInputStream(new FileInputStream(zipFile));
	    	ZipEntry entry=null;//压缩实体对象
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

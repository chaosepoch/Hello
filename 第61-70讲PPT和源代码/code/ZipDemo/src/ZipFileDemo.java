import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//使用JAVA的压缩流实现对文件夹的压缩实例
public class ZipFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //要压缩的目录
	   File dir = new File("c:"+File.separator+"haha");
       //压缩后的文件
	   File zipFile = new File("c:"+File.separator+"haha.zip");
       //输出压缩流
	   ZipOutputStream zout = null;
	   //输入流,用来读取每一个要压缩的文件
	   InputStream in=null;
	   try
	   {
		   //实例化压缩输出流对象
		   zout = new ZipOutputStream(new FileOutputStream(zipFile));
		  
		   //遍历要压缩的目录  
		   File[] files = dir.listFiles();
	       
		   //写入压缩文件的备注	   
		   zout.setComment("my zip file demo");
		   for(int i=0;i<files.length;i++)
		   {
			   in = new FileInputStream(files[i]);
			   //生成一个压缩实体，压入到压缩文件中。
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

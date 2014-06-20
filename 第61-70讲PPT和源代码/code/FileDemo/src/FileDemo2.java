import java.io.File;
import java.io.IOException;


public class FileDemo2 {

	
	public static void main(String[] args) {
		
		//创建c:\\haha\\hehe\\test.txt 文件
		//1.首先创建c:\\haha目录
		//2.创建test.txt文件
		
		//创建父目录
		File parent = new File("c:"+File.separator+"haha"+File.separator+"hehe");
		
		File child = new File(parent,"test.txt");
		
		try
		{
			if(!parent.exists()) //首先检查父目录是否已经存在
			{
				 //parent.mkdir();//一次只能创建一个目录
				 parent.mkdirs();//一次可以创建多个目录
				 child.createNewFile();//创建子文件;
				 System.out.println("文件创建成功！");
			}
			else
			{
				child.createNewFile();
				System.out.println("文件创建成功！");
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		for(int i=0;i<10;i++) //休眠10秒钟
		{
			try
			{
			   Thread.sleep(1000);//线程休眠1秒钟;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("文件的绝对路径："+child.getAbsolutePath());
		System.out.println("文件名："+child.getName());
		System.out.println("文件父目录的路径："+child.getParent());
		
		System.out.println("是否是目录："+child.isDirectory());
		System.out.println("是否是文件："+child.isFile());
		System.out.println("文件长度："+child.length()+"字节");
		
		
		//删除文件
		child.delete();
	}

}

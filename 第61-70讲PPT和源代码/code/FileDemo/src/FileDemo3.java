import java.io.File;
import java.net.URI;


public class FileDemo3 {

	
	public static void main(String[] args) {
		
		File file = new File("c:"+File.separator+"haha"+File.separator+"hehe");
		if(file.exists())
		{
			if(file.isDirectory())
			{
				File[] list = file.listFiles();
				for(int i=0;i<list.length;i++)
				{
					System.out.println(list[i].getName());
				}
			}
		}
		
		File file2 = new File(file,"test.txt");
		if(file2.exists())
		{
			System.out.println(file2.length()+"字节");
		}
		
		//把文件对象转换为URI对象
		URI uri = file2.toURI();
		System.out.println(uri.toString());
		
		System.out.println("是否是隐藏文件："+file2.isHidden());
		
	}

}

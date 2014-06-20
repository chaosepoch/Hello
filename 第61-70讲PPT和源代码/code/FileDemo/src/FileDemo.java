import java.io.File;
import java.io.IOException;

//File类的详细用法
public class FileDemo {

	public static void main(String[] args) {
       
		//创建c:\haha 目录
	    //File dir = new File("c:\\test.txt");
		//推荐以下写法
	    File dir = new File("c:"+File.separator+"test.txt");
	    //dir.mkdir(); //创建目录
	    try
	    {
	       dir.createNewFile();//仅适用于创建文件，不适合创建目录。
	    }
	    catch(IOException ex)
	    {
	    	ex.printStackTrace();
	    }
	    
	    System.out.println("系统目录之间的分隔符："+File.pathSeparator);
	    System.out.println("系统默认使用的分隔符："+File.separator);
	}

}

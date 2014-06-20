import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//JAVA合并流实例
public class SequenceStreamDemo {

	//合并文件的方法
	public static SequenceInputStream mergeFiles(SequenceInputStream sin,File f) throws Exception
	{
		sin = new SequenceInputStream(sin,new FileInputStream(f));
	    return sin;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File a = new File("c:"+File.separator+"a.txt");
       File b = new File("c:"+File.separator+"b.txt");
       File c = new File("c:"+File.separator+"c.txt");
       File d = new File("c:"+File.separator+"d.txt");
       SequenceInputStream sin =null;
       
       try
       {
         FileOutputStream fout = new FileOutputStream("c:"+File.separator+"abcd.txt");
         sin = new SequenceInputStream(new FileInputStream(a),new FileInputStream(b));
         sin = SequenceStreamDemo.mergeFiles(sin, c);
         sin = SequenceStreamDemo.mergeFiles(sin, d);
         int temp=0;
         while((temp=sin.read())!=-1)
         {
        	 fout.write(temp);
         }
         fout.close();
       }
       catch(Exception ex)
       {
    	   ex.printStackTrace();
       }
       finally
       {
    	   try {
			sin.close();
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
       }
	}

}

import java.io.File;
import java.io.IOException;

//File�����ϸ�÷�
public class FileDemo {

	public static void main(String[] args) {
       
		//����c:\haha Ŀ¼
	    //File dir = new File("c:\\test.txt");
		//�Ƽ�����д��
	    File dir = new File("c:"+File.separator+"test.txt");
	    //dir.mkdir(); //����Ŀ¼
	    try
	    {
	       dir.createNewFile();//�������ڴ����ļ������ʺϴ���Ŀ¼��
	    }
	    catch(IOException ex)
	    {
	    	ex.printStackTrace();
	    }
	    
	    System.out.println("ϵͳĿ¼֮��ķָ�����"+File.pathSeparator);
	    System.out.println("ϵͳĬ��ʹ�õķָ�����"+File.separator);
	}

}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileStreamDemo {
	
	//ʹ���ļ�����һ����ʫд���ı��ļ���
	public static void main(String[] args) {

		String s ="��ǰ���¹�\r\n���ǵ���˪\r\n��ͷ������\r\n���ǹ��¸�\r\n";
		File file = new File("c:"+File.separator+"test.txt");
		OutputStream out=null;
		InputStream in = null;
		try
		{
	       	out = new FileOutputStream(file);
	       	in = new FileInputStream(file);
	       	out.write(s.getBytes());//���ַ���ת��Ϊ�ֽ����飬д���ļ�.
		    //ͨ���������˵�����ֽ���Ĭ���ǲ�ʹ�û������ġ�
	       	out.close();
		    //д����֮���ȡ�ļ�
		    byte[] buf = new byte[(int)file.length()];
		    in.read(buf);//���ļ����ݶ��뻺����
		    String temp = new String(buf);
		    System.out.print(temp);
		    in.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}

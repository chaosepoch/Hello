import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class DataStreamDemo {

	public static void main(String[] args) {

		File file = new File("c:"+File.separator+"test.txt");
		DataInputStream din=null;
		DataOutputStream dout = null;
		try
		{
			din = new DataInputStream(new FileInputStream(file));
			dout = new DataOutputStream(new FileOutputStream(file));
		    //д��java����������
			dout.writeInt(1000);//д������
			dout.writeChar('ţ');//д���ַ�����
			dout.writeDouble(3.1415);
			dout.writeBoolean(true);
			dout.close();
			//�����ļ�����
			//ע�⣺�����Ĵ�������д��Ĵ���һ��
			System.out.println(din.readInt());
			System.out.println(din.readChar());
			System.out.println(din.readDouble());
			System.out.println(din.readBoolean());
			din.close();
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			
		}
	}

}

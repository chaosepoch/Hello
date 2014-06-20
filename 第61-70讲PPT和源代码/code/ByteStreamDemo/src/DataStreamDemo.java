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
		    //写入java的数据类型
			dout.writeInt(1000);//写入整型
			dout.writeChar('牛');//写入字符类型
			dout.writeDouble(3.1415);
			dout.writeBoolean(true);
			dout.close();
			//读出文件内容
			//注意：读出的次序必须和写入的次序一致
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


//��һ���û�����ͨ�����л��������ļ���
public class SerializableDemo {


	public static void main(String[] args) {
     
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		String fileName = "c:"+File.separator+"Users.dat";
		//Ҫ���л��Ķ���
		Users user = new Users("������","123456",10000,500.00,new Date());
		
		try
		{
		   out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
		   in = new ObjectInputStream(new FileInputStream(new File(fileName)));
		   //ͨ�����л�д�����
		   out.writeObject(user);
		   //ͨ�������л���������
		   Users  temp = (Users)in.readObject();
		   System.out.println(temp);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
			   out.close();
			   in.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}

}

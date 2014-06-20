import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


//把一个用户对象通过序列化保存在文件中
public class SerializableDemo {


	public static void main(String[] args) {
     
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		String fileName = "c:"+File.separator+"Users.dat";
		//要序列化的对象
		Users user = new Users("张三丰","123456",10000,500.00,new Date());
		
		try
		{
		   out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
		   in = new ObjectInputStream(new FileInputStream(new File(fileName)));
		   //通过序列化写入对象
		   out.writeObject(user);
		   //通过反序列化读出对象
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

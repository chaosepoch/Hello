import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

//��һ��������л�
public class SerializableDemo2 {
	
	private File dest ;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	
	public SerializableDemo2(File dest) throws Exception
	{
		this.dest = dest;
		in = new ObjectInputStream(new FileInputStream(this.dest));
		out = new ObjectOutputStream(new FileOutputStream(this.dest));
	}
	
	public File getDest() {
		return dest;
	}

	public void setDest(File dest) {
		this.dest = dest;
	}
	
	public void writeObjects(Object[] objs)
	{
		try
		{
		  this.out.writeObject(objs);
		  this.out.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	public void readObjects()
	{
		try
		{
		  Users[] users =(Users[])this.in.readObject();
		  for(Users u:users)
		  {
			  System.out.println(u);
		  }
		  in.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	   
		Users[] users = {
				new Users("����","123456",10000,500.00,new Date()),
				new Users("����","666666",10000,500.00,new Date()),
				new Users("����","888888",20000,3500.00,new Date()),
				new Users("����","000000",7000,1500.00,new Date()),
				new Users("����","555555",100000,7500.00,new Date()),
				
		};
		File dest = new File("c:"+File.separator+"Users.dat");
		try
		{
		  SerializableDemo2 sd = new SerializableDemo2(dest);
		  //���л���������
	      sd.writeObjects(users);
		  //�����л���������
		  sd.readObjects();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

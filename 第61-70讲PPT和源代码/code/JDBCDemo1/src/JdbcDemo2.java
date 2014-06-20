import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcDemo2 {

	public static final String url="jdbc:mysql://localhost:3306/school"; //�������ݿ��URL��ַ
	public static final String username="root";//���ݿ���û���
	public static final String password="";//���ݿ������
	
	public static Connection conn=null;//���Ӷ���
    public static Statement stmt=null;//���
    public static ResultSet rs = null;//�����
	
    static
    {
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		if(conn==null)
    		{
    			conn  =DriverManager.getConnection(url, username, password);
    		}
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    }
    
 	//��ѯ���е�ѧ������
	public static void query()
	{
       String sql = "select * from students;";
	   try
       {
    	   stmt = conn.createStatement();
    	   rs=stmt.executeQuery(sql);
    	   while(rs.next())
    	   {
    		   System.out.println("ѧ�ţ�"+rs.getInt("sid")+",������"+rs.getString("sname")+",����:"+rs.getInt("age")+",�Ա�"+rs.getString("gender"));
    	   }
       }
       catch(Exception ex)
       {
    	   ex.printStackTrace();
       }
       finally
       {
    	   destoryResource(); 
       }
	}
	
	//���ѧ������
	public static boolean add()
	{
		String sql = "insert into Students values (5,'zhaoliu',18,'f','zhangsan@qq.com','guangzhou');";
		try
		{
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		finally
		{
			destoryResource();
		}
	}

	//ɾ��ָ��ѧ�ŵ�ѧ������
	public static boolean delete(int sid)
	{
		String sql = "delete from students where sid="+sid;
		try
		{
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		finally
		{
			destoryResource();
		}
	}
	
	//�޸�����ѧ��������Ϊ20��
	public static boolean update(int age)
	{
		String sql = "update students set age="+age;
		try
		{
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		finally
		{
			destoryResource();
		}
	}
	
	
	
	//�ͷ���Դ�ķ���
	public static void destoryResource()
	{
		try
		{
			if(rs!=null)
			{
				rs.close();
				rs=null;
			}
			if(stmt!=null)
			{
				stmt.close();
				stmt=null;
			}
	 		/*��ʱ���ͷ�Connection��Դ
			if(conn!=null)
			{
				conn.close();
				conn=null;
			}*/
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		JdbcDemo2.query(); //��ѯ����ѧ������
		
		if(JdbcDemo2.add())
		{
			System.out.println("��ӳɹ���");
		}
		else
		{
			System.out.println("���ʧ�ܣ�");
		}
		
		System.out.println("---------------------");
		JdbcDemo2.query();
		JdbcDemo2.delete(1);
		System.out.println("------ɾ��ѧ��Ϊ1��ѧ��֮��--------");
		JdbcDemo2.query();
		
		JdbcDemo2.update(20);
		System.out.println("------�޸�����ѧ������Ϊ20��--------");
		JdbcDemo2.query();
		
	}

}

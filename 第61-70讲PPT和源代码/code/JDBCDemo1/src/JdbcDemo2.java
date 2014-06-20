import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcDemo2 {

	public static final String url="jdbc:mysql://localhost:3306/school"; //连接数据库的URL地址
	public static final String username="root";//数据库的用户名
	public static final String password="";//数据库的密码
	
	public static Connection conn=null;//连接对象
    public static Statement stmt=null;//语句
    public static ResultSet rs = null;//结果集
	
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
    
 	//查询所有的学生资料
	public static void query()
	{
       String sql = "select * from students;";
	   try
       {
    	   stmt = conn.createStatement();
    	   rs=stmt.executeQuery(sql);
    	   while(rs.next())
    	   {
    		   System.out.println("学号："+rs.getInt("sid")+",姓名："+rs.getString("sname")+",年龄:"+rs.getInt("age")+",性别："+rs.getString("gender"));
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
	
	//添加学生方法
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

	//删除指定学号的学生资料
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
	
	//修改所有学生的年龄为20岁
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
	
	
	
	//释放资源的方法
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
	 		/*暂时不释放Connection资源
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
		
		JdbcDemo2.query(); //查询所有学生资料
		
		if(JdbcDemo2.add())
		{
			System.out.println("添加成功！");
		}
		else
		{
			System.out.println("添加失败！");
		}
		
		System.out.println("---------------------");
		JdbcDemo2.query();
		JdbcDemo2.delete(1);
		System.out.println("------删除学号为1的学生之后--------");
		JdbcDemo2.query();
		
		JdbcDemo2.update(20);
		System.out.println("------修改所有学生年龄为20岁--------");
		JdbcDemo2.query();
		
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//使用JDBC连接MySQL数据库
public class JdbcDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		//1.加载MySQL数据库驱动
		
		String url="jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8"; //连接数据库的URL地址
		String username="root";//数据库的用户名
		String password="";//数据库的密码
		
     	try
     	{
     		Class.forName("com.mysql.jdbc.Driver");
            //2.建立数据库连接
     		conn = DriverManager.getConnection(url, username, password);
     		if(conn!=null)
     		{
     			System.out.println("数据库连接正常！");
     		}
     		else
     		{
     			System.out.println("数据库连接失败！");
     		}
     		
     		//3.创建语句对象
     		Statement stmt = conn.createStatement();
     		String sql = "insert into Students values (7,'张学友',18,'m','zhangsan@qq.com','西安市长安区');";
     	    //4.执行语句
     		int result = stmt.executeUpdate(sql);
     		if(result>0)
     		{
     			System.out.println("添加成功！");
     		}
     		else
     		{
     			System.out.println("添加失败！");
     		}
     	}
     	catch(Exception ex)
     	{
     		ex.printStackTrace();
     	}
     	finally
     	{
     		//5.释放资源
     		if(conn!=null)
     		{
     			try {
					conn.close();
				    conn=null;
     			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
     		}
     	}
     	
	}

}

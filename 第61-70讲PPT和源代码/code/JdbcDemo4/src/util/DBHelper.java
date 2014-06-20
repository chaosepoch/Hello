package util;

import java.sql.Connection;
import java.sql.DriverManager;

//工具层


//DBHelper类，体现了单例模式的思想
public class DBHelper {

	private static Connection conn; //数据库连接对象
	//驱动
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//数据库的URL地址
	private static final String URL="jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
    //用户名
	private static final String USERNAME="root";
	//密码
	private static final String PASSWORD="";
	
	//在静态代码块中，负责加载驱动
	static
	{
		try
		{
			Class.forName(DRIVER);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	//既然是单例模式，应该让构造方法私有化
	private DBHelper()
	{
		
	}
	
	//外部调用的统一的方法
	public static Connection getConnection() throws Exception
	{
		if(conn==null)
		{
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		return conn;
	}
}


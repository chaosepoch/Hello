import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
		
		String username = "root";
		String password = "";

		Connection conn = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			
			String sql = "{call myproc(?)}";
			//生成一个Callable语句
			stmt = conn.prepareCall(sql);
			//初始化参数
			stmt.setInt(1, 0);
			//注册输出参数，指定输出参数的类型
			stmt.registerOutParameter(1,Types.INTEGER);
			//执行存储过程
			stmt.execute();
			//获取输出参数，打印结果
			System.out.println("学生数量是："+stmt.getInt(1));
            
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

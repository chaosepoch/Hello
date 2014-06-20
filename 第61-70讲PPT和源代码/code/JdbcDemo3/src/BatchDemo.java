import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
		
		String username = "root";
		String password = "";

		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "insert into Students values (12,'张三丰',30,'男','zhangsan@qq.com','西安市');";
			stmt.addBatch(sql);
			
		    sql = "insert into Students values (13,'张四丰',30,'男','zhangsan@qq.com','西安市');";
			stmt.addBatch(sql);
			sql = "insert into Students values (14,'张五丰',30,'男','zhangsan@qq.com','西安市');";
			stmt.addBatch(sql);
			
			sql = "update Students set age = 100 ;";
			stmt.addBatch(sql);
			
			int[] result = stmt.executeBatch();
			for(int i=0;i<result.length;i++)
			{
				System.out.println("第"+(i+1)+"条批处理受影响的记录条数："+result[i]);
			}
            
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

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Types;


public class TransactionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
		
		String username = "root";
		String password = "";

		Connection conn = null;
		Statement stmt = null;
		
		//保存点对象
		Savepoint sp = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			conn.setAutoCommit(false); //默认不提交事务
			
			String sql = "insert into Students values (15,'张六丰',30,'男','zhangsan@qq.com','西安市');";
			stmt.addBatch(sql);
			stmt.executeBatch();
			sp = conn.setSavepoint(); //给保存点起名字
			
			
		    sql = "insert into Students values (16,'张七丰',30,'男','zhangsan@qq.com','西安市');";
			stmt.addBatch(sql);
			
			//主键冲突，抛出异常
			sql = "insert into Students values (2,'张八丰',30,'男','zhangsan@qq.com','西安市');";
			stmt.addBatch(sql);
			
			sql = "update Students set age = 100 ;";
			stmt.addBatch(sql);
			
			conn.commit(); //提交事务
			int[] result = stmt.executeBatch();
			for(int i=0;i<result.length;i++)
			{
				System.out.println("第"+(i+1)+"条批处理受影响的记录条数："+result[i]);
			}
            
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				//conn.rollback();//回滚事务
				conn.rollback(sp); //回滚到指定的保存点
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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

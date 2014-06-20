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
		
		//��������
		Savepoint sp = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			conn.setAutoCommit(false); //Ĭ�ϲ��ύ����
			
			String sql = "insert into Students values (15,'������',30,'��','zhangsan@qq.com','������');";
			stmt.addBatch(sql);
			stmt.executeBatch();
			sp = conn.setSavepoint(); //�������������
			
			
		    sql = "insert into Students values (16,'���߷�',30,'��','zhangsan@qq.com','������');";
			stmt.addBatch(sql);
			
			//������ͻ���׳��쳣
			sql = "insert into Students values (2,'�Ű˷�',30,'��','zhangsan@qq.com','������');";
			stmt.addBatch(sql);
			
			sql = "update Students set age = 100 ;";
			stmt.addBatch(sql);
			
			conn.commit(); //�ύ����
			int[] result = stmt.executeBatch();
			for(int i=0;i<result.length;i++)
			{
				System.out.println("��"+(i+1)+"����������Ӱ��ļ�¼������"+result[i]);
			}
            
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				//conn.rollback();//�ع�����
				conn.rollback(sp); //�ع���ָ���ı����
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

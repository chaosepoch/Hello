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
			//����һ��Callable���
			stmt = conn.prepareCall(sql);
			//��ʼ������
			stmt.setInt(1, 0);
			//ע�����������ָ���������������
			stmt.registerOutParameter(1,Types.INTEGER);
			//ִ�д洢����
			stmt.execute();
			//��ȡ�����������ӡ���
			System.out.println("ѧ�������ǣ�"+stmt.getInt(1));
            
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

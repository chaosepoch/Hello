import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����URLд�����������������
		//String url = "jdbc:mysql://localhost:3306/school";
		//���������������
		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
		
		String username = "root";
		String password = "";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			// String sql =
			// "insert into Students values (8,'admin',12,'m','admin@123.net','abc');";
			String sql = "insert into Students values (?,?,?,?,?,?);";
			stmt = conn.prepareStatement(sql);
			//ע�⣺�±��1��ʼ��
			stmt.setInt(1, 11);
			stmt.setString(2, "������");
			stmt.setInt(3, 24);
			stmt.setString(4, "��");
			stmt.setString(5, "wangwuwu@qq.com");
			stmt.setString(6, "�Ϻ����ֶ�����");
			
            int result = stmt.executeUpdate();
            if(result>0)
            {
            	System.out.println("����ɹ���");
            }
            else
            {
            	System.out.println("����ʧ�ܣ�");
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

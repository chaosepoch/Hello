import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			// String sql =
			// "insert into Students values (8,'admin',12,'m','admin@123.net','abc');";
			String sql = "select * from Students;";
			stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
				/*
            	System.out.println(rs.getInt("sid") + ","
						+ rs.getString("sname") + "," + rs.getInt("age"));*/
            	
            	System.out.println(rs.getInt(1) + ","
						+ rs.getString(2) + "," + rs.getInt(3));
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

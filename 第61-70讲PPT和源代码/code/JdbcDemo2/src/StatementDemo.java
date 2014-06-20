import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class StatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String url = "jdbc:mysql://localhost:3306/school";
       String username = "root";
       String password = "";
       
       try
       {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection conn = DriverManager.getConnection(url, username, password);
    	   //String sql = "insert into Students values (8,'admin',12,'m','admin@123.net','abc');";
    	   String sql = "select * from Students;";
    	   Statement stmt = conn.createStatement();
    	   
    	   if(stmt.execute(sql))
    	   {
    		   System.out.println("查询成功！");
    	   }
    	   else
    	   {
    		   System.out.println("更新成功！");
    	   }
    	   stmt.close();
    	   conn.close();
       }
       catch(Exception ex)
       {
    	   ex.printStackTrace();
       }
       
	}

}

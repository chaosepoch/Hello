import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//ʹ��JDBC����MySQL���ݿ�
public class JdbcDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		//1.����MySQL���ݿ�����
		
		String url="jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8"; //�������ݿ��URL��ַ
		String username="root";//���ݿ���û���
		String password="";//���ݿ������
		
     	try
     	{
     		Class.forName("com.mysql.jdbc.Driver");
            //2.�������ݿ�����
     		conn = DriverManager.getConnection(url, username, password);
     		if(conn!=null)
     		{
     			System.out.println("���ݿ�����������");
     		}
     		else
     		{
     			System.out.println("���ݿ�����ʧ�ܣ�");
     		}
     		
     		//3.����������
     		Statement stmt = conn.createStatement();
     		String sql = "insert into Students values (7,'��ѧ��',18,'m','zhangsan@qq.com','�����г�����');";
     	    //4.ִ�����
     		int result = stmt.executeUpdate(sql);
     		if(result>0)
     		{
     			System.out.println("��ӳɹ���");
     		}
     		else
     		{
     			System.out.println("���ʧ�ܣ�");
     		}
     	}
     	catch(Exception ex)
     	{
     		ex.printStackTrace();
     	}
     	finally
     	{
     		//5.�ͷ���Դ
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

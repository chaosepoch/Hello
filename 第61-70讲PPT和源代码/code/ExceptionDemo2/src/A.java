import java.sql.SQLException;


public class A {

	public void fn() throws SQLException,ClassNotFoundException,Exception
	{
		
	}
}

class B extends A
{

	@Override
	public void fn() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	public void m()
	{
		try
		{
		  throw new SQLException();	
		}
		catch(SQLException ex)//���Ҿ��죬ֻ�ܴ���������С͵��
		{
			
		}
		catch(Exception ex) //���羯�죬�������������е�С͵��
		{
			
		}
		
	}
 	
}
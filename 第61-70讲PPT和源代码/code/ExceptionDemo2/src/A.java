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
		catch(SQLException ex)//国家警察，只能逮捕本国的小偷。
		{
			
		}
		catch(Exception ex) //世界警察，逮捕世界上所有的小偷。
		{
			
		}
		
	}
 	
}
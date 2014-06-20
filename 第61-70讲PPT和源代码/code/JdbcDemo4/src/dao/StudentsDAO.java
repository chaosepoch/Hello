package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Students;
import util.DBHelper;

//DAO层

//学生业务逻辑类
public class StudentsDAO {

	//添加学生方法
	public boolean addStudents(Students s)
	{
		String sql = "insert into Students values (?,?,?,?,?,?);";
		Connection conn =null;
		PreparedStatement stmt = null;
		
		try
		{
		   conn = DBHelper.getConnection();
		   stmt = conn.prepareStatement(sql);
		   stmt.setInt(1, s.getSid());
		   stmt.setString(2, s.getSname());
		   stmt.setInt(3, s.getAge());
		   stmt.setString(4, s.getGender());
		   stmt.setString(5, s.getEmail());
		   stmt.setString(6, s.getAddress());
		   
		   int result = stmt.executeUpdate();
		   if(result>0)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
			   
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		finally
		{
			try
			{
				stmt.close();
				conn.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		
	}
}

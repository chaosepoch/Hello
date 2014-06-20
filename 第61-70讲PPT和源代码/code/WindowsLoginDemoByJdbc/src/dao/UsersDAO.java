package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBHelper;
import entity.Users;

//用户的业务逻辑类
public class UsersDAO {

	
	//用户登录方法
	public boolean userLogin(Users u)
	{
		Connection conn=null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from users where username=? and password=?";
		try
		{
			conn = DBHelper.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getPassword());
			rs = stmt.executeQuery();
			if(rs.next())
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
				if(rs!=null)
				{
					rs.close();
					rs = null;
				}
				if(stmt!=null)
				{
					stmt.close();
					stmt =null;
				}
				/*
				if(conn!=null)
				{
					conn.close();
					conn=null;
				}*/
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		
	}
	
	//用户注册方法
	public boolean userRegister(Users u)
	{
		Connection conn=null;
		PreparedStatement stmt = null;
		
		String sql = "insert into users (username,password) values (?,?)";
		try
		{
			conn = DBHelper.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getPassword());
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
				if(stmt!=null)
				{
					stmt.close();
					stmt =null;
				}
				/*
				if(conn!=null)
				{
					conn.close();
					conn=null;
				}*/
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
	}
}

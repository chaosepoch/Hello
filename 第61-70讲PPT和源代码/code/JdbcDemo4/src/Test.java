import java.sql.Connection;

import dao.StudentsDAO;
import entity.Students;
import util.DBHelper;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
          
		  Connection conn1 = DBHelper.getConnection();
          Connection conn2 = DBHelper.getConnection();
          //测试是否是单例模式
          System.out.println(conn1==conn2);
		   
		  Students s = new Students(16,"张无忌",35,"男","zwj@123.com","武当山");
		  StudentsDAO sdao = new StudentsDAO();
		  if(sdao.addStudents(s))
		  {
			  System.out.println("添加成功！");
		  }
		  else
		  {
			  System.out.println("添加失败！");
		  }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

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
          //�����Ƿ��ǵ���ģʽ
          System.out.println(conn1==conn2);
		   
		  Students s = new Students(16,"���޼�",35,"��","zwj@123.com","�䵱ɽ");
		  StudentsDAO sdao = new StudentsDAO();
		  if(sdao.addStudents(s))
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
	}

}

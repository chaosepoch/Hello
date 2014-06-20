package util;

import java.sql.Connection;
import java.sql.DriverManager;

//���߲�


//DBHelper�࣬�����˵���ģʽ��˼��
public class DBHelper {

	private static Connection conn; //���ݿ����Ӷ���
	//����
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//���ݿ��URL��ַ
	private static final String URL="jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
    //�û���
	private static final String USERNAME="root";
	//����
	private static final String PASSWORD="";
	
	//�ھ�̬������У������������
	static
	{
		try
		{
			Class.forName(DRIVER);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	//��Ȼ�ǵ���ģʽ��Ӧ���ù��췽��˽�л�
	private DBHelper()
	{
		
	}
	
	//�ⲿ���õ�ͳһ�ķ���
	public static Connection getConnection() throws Exception
	{
		if(conn==null)
		{
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		return conn;
	}
}


import java.util.Scanner;

//�û���
class Users
{
   String username; //�û���
   String password; //����
   
   Users(String username,String password)
   {
	   this.username = username;
	   this.password = password;
   }
}


public class LoginDemo {

	Users user;
    
	//�û���¼����
	public boolean userLogin(String username,String password)
	{
		if(this.user.username.equals(username)&&this.user.password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void setUser(Users user)
	{
		this.user = user;
	}
	
	public static void main(String[] args) {
	
		String username;//�û���
		String password;//����
		int iCount=0;
		boolean flag=false; //�ж��Ƿ��¼�ɹ���
		
		Scanner in = new Scanner(System.in);
		System.out.println("*********�û�ע��**********");
		System.out.println("�������û�����");
		username = in.next();
		System.out.println("���������룺");
		password = in.next();
		
		Users u = new Users(username,password);
		LoginDemo demo = new LoginDemo();
		demo.setUser(u);
		System.out.println("ע��ɹ���");
		
		System.out.println("*********�û���¼**********");
		do{
			System.out.println("�������û�����");
			username = in.next();
			System.out.println("���������룺");
			password = in.next();
			
			if(demo.userLogin(username, password))
			{
				break;
			}
			else
			{
				iCount++;
				if(iCount>=3&&flag==false) //�����¼ʧ�ܳ�������
				{
					System.out.println("��¼ʧ�ܴ����������Σ����򼴽��˳���");
					System.exit(0);
				}
				else
				{
					System.out.println("�����û����������룡");
				}
			}
		}while(true);
		
		System.out.println("��¼�ɹ���");
	}

}

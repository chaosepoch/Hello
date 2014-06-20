import java.util.Scanner;

//用户类
class Users
{
   String username; //用户名
   String password; //密码
   
   Users(String username,String password)
   {
	   this.username = username;
	   this.password = password;
   }
}


public class LoginDemo {

	Users user;
    
	//用户登录方法
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
	
		String username;//用户名
		String password;//密码
		int iCount=0;
		boolean flag=false; //判断是否登录成功！
		
		Scanner in = new Scanner(System.in);
		System.out.println("*********用户注册**********");
		System.out.println("请输入用户名：");
		username = in.next();
		System.out.println("请输入密码：");
		password = in.next();
		
		Users u = new Users(username,password);
		LoginDemo demo = new LoginDemo();
		demo.setUser(u);
		System.out.println("注册成功！");
		
		System.out.println("*********用户登录**********");
		do{
			System.out.println("请输入用户名：");
			username = in.next();
			System.out.println("请输入密码：");
			password = in.next();
			
			if(demo.userLogin(username, password))
			{
				break;
			}
			else
			{
				iCount++;
				if(iCount>=3&&flag==false) //如果登录失败超过三次
				{
					System.out.println("登录失败次数超过三次，程序即将退出！");
					System.exit(0);
				}
				else
				{
					System.out.println("请检查用户名或者密码！");
				}
			}
		}while(true);
		
		System.out.println("登录成功！");
	}

}

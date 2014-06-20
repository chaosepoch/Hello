package entity;

//用户实体类
public class Users {

	private int uid; //用户编号
	private String username;//用户名
	private String password;//密码
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users()
	{
		
	}
	public Users(int uid,String username,String password)
	{
		this.uid = uid;
		this.username = username;
		this.password = password;
	}
}

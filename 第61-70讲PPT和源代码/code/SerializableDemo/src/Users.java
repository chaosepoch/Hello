import java.io.Serializable;
import java.util.Date;

//用户类
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;//用户名
	transient private String password;//密码,属于个人隐私，不想序列化
	private int experience;//经验值
	private double money;//金钱
	private Date regtime;//注册时间;
	
	public Users()
	{
		
	}
	public Users(String username,String password,int experience,double money,Date regtime)
	{
		this.username = username;
		this.password = password;
		this.experience = experience;
		this.money = money;
		this.regtime =regtime;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	
	public String toString()
	{
		return "用户名："+this.getUsername()+"\n密码："+this.getPassword()+"\n经验值："+this.getExperience()+"\n金钱："+this.getMoney()+"\n注册日期："+this.getRegtime();
	}
	
}

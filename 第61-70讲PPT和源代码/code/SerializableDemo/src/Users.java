import java.io.Serializable;
import java.util.Date;

//�û���
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;//�û���
	transient private String password;//����,���ڸ�����˽���������л�
	private int experience;//����ֵ
	private double money;//��Ǯ
	private Date regtime;//ע��ʱ��;
	
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
		return "�û�����"+this.getUsername()+"\n���룺"+this.getPassword()+"\n����ֵ��"+this.getExperience()+"\n��Ǯ��"+this.getMoney()+"\nע�����ڣ�"+this.getRegtime();
	}
	
}

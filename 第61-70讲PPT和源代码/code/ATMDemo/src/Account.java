//银行账户类
public class Account {

	private String name; // 户主
	private String id; // 账号
	private String password;// 密码
	private double balance;// 余额

	Account()
	{
		init();
	}
	
	//初始化账户的方法
	private void init()
	{
		this.name = "无名氏";
		this.id = "";
		this.password = "888888";
		this.balance = 0.0;
		
		for(int i=0;i<6;i++)
		{
			int temp = (int)(Math.random()*100)%10;//生成是0-9之间的随机数
			id+=temp;
		}
	}
    
	@Override
	public String toString() 
	{
		return "户主："+this.getName()+"\n账号："+this.getId()+"\n余额："+this.getBalance();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

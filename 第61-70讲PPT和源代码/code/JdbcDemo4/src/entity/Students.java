package entity;

//实体层

//学生类
public class Students {

	private int sid;//学号
	private String sname;//姓名
	private int age;//年龄
	private String gender;//性别
	private String email;//电子邮箱
	private String address;//地址
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//保留默认的不带参数的构造方法
	public Students()
	{
		
	}
	
	public Students(int sid,String sname,int age,String gender,String email,String address)
	{
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
	}
}

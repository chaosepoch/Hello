package entity;

//ʵ���

//ѧ����
public class Students {

	private int sid;//ѧ��
	private String sname;//����
	private int age;//����
	private String gender;//�Ա�
	private String email;//��������
	private String address;//��ַ
	
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
	
	//����Ĭ�ϵĲ��������Ĺ��췽��
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

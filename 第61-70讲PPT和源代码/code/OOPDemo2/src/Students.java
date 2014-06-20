//学生类
public class Students {

	String sid;//学号
	String name;//姓名
	char gender;//性别  M：male 男性  F：female 女性
	int age;
	String major;
	String email;
	String qq;
	String address;
	
	static int number=0;
	
	Students()
	{
		System.out.println("创建了一个学生....");
		number++;
	}
	
	Students(String sid,String name,char gender,int age,String major,String email,String qq,String address)
	{
		this();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.email = email;
		this.qq = qq;
		this.address = address;
	
	}
	
	public void goToClassroom()
	{
		System.out.println(this.name+"兴高采烈地去上课了....");
	}
	
	public void goToExam()
	{
		System.out.println(this.name+"提心吊胆地去考试了.....");
	}
	
	public static void study()
	{
		System.out.println("Good good study,day day up!");
	}
	
	public static void main(String[] args)
	{
		Students s = new Students("S001","郭美美",'F',18,"工商管理","gmm@163.com","1234567","西安市大学城");
	    s.goToClassroom();
	    s.goToExam();
	    System.out.println("学生人数："+Students.number);
	    Students.study();
	}
}

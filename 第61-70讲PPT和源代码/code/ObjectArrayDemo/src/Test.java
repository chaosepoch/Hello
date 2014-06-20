
public class Test {
   
	//统计班级男女生人数的方法
	public static int getGenderNumber(Students[] stus,char gender)
	{
		int male_number=0;//男生人数
		int female_number=0;//女生人数
		for(Students s:stus)
		{
			if(s.gender=='M'||s.gender=='m')
			{
				male_number++;
			}
			else if(s.gender=='F'||s.gender=='f')
			{
				female_number++;
			}
		}
		if(gender=='M'||gender=='m')
		{
			return male_number;
		}
		else
		{
			return female_number;
		}
		
	}
	
	//统计班级的平均年龄
	public static int averageAge(Students[] stus)
	{
		int sum=0;
		for(Students s:stus)
		{
			sum+=s.age;
		}
		return sum/stus.length;
	}
	
	public static void main(String[] args) {
	 
		Students[] stus = {
				new Students("张三",'M',20),
				new Students("李四",'F',18),
				new Students("王五",'M',22),
				new Students("赵六",'M',19),
				new Students("孙七",'F',20)
				
		};
		//增强行for循环，foreach循环
		for(Students s:stus)
		{
			s.introduce();
		}
		System.out.println("----------------");
		System.out.println("班级男生人数："+Test.getGenderNumber(stus, 'M'));
		System.out.println("班级女生人数："+Test.getGenderNumber(stus, 'F'));
		System.out.println("班级平均年龄："+Test.averageAge(stus)+"岁。");
	}

}

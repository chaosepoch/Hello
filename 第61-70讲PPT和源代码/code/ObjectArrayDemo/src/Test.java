
public class Test {
   
	//ͳ�ư༶��Ů�������ķ���
	public static int getGenderNumber(Students[] stus,char gender)
	{
		int male_number=0;//��������
		int female_number=0;//Ů������
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
	
	//ͳ�ư༶��ƽ������
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
				new Students("����",'M',20),
				new Students("����",'F',18),
				new Students("����",'M',22),
				new Students("����",'M',19),
				new Students("����",'F',20)
				
		};
		//��ǿ��forѭ����foreachѭ��
		for(Students s:stus)
		{
			s.introduce();
		}
		System.out.println("----------------");
		System.out.println("�༶����������"+Test.getGenderNumber(stus, 'M'));
		System.out.println("�༶Ů��������"+Test.getGenderNumber(stus, 'F'));
		System.out.println("�༶ƽ�����䣺"+Test.averageAge(stus)+"�ꡣ");
	}

}

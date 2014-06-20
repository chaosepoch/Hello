import java.util.Arrays;

class Students implements Comparable
{
   int id; //ѧ��
   String name;//����
   int age;//����
   
   Students(int id,String name,int age)
   {
	   this.id = id;
	   this.name = name;
	   this.age = age;
   }
   
   public String toString()
   {
	   return "ѧ�ţ�"+this.id+"��������"+this.name+"�����䣺"+this.age;
   }

	@Override
	// ����1����ʾ����  ����-1��С��  ����0������
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Students)
		{
			Students s = (Students)obj;
			if(this.id > s.id)
			{
				return 1;
			}
			else if(this.id < s.id)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return -1;
		}
	}

}


public class ArraysDemo2 {
	
	public static void main(String[] args) {
		
		Students[] stus = {
				new Students(5,"����",19),
				new Students(15,"����",22),
				new Students(2,"����",17),
				new Students(10,"����",18),
				new Students(9,"����",21),
				
		};
		
		for(Students s: stus)
		{
			System.out.println(s);
		}
		
		System.out.println("--------����֮��---------");
	    Arrays.sort(stus);
	    for(Students s: stus)
		{
			System.out.println(s);
		}
	
	}

}

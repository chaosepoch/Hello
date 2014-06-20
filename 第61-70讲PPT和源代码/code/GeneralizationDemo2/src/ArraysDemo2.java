import java.util.Arrays;

class Students implements Comparable
{
   int id; //学号
   String name;//姓名
   int age;//年龄
   
   Students(int id,String name,int age)
   {
	   this.id = id;
	   this.name = name;
	   this.age = age;
   }
   
   public String toString()
   {
	   return "学号："+this.id+"，姓名："+this.name+"，年龄："+this.age;
   }

	@Override
	// 返回1：表示大于  返回-1：小于  返回0：等于
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
				new Students(5,"张三",19),
				new Students(15,"李四",22),
				new Students(2,"王五",17),
				new Students(10,"赵六",18),
				new Students(9,"孙七",21),
				
		};
		
		for(Students s: stus)
		{
			System.out.println(s);
		}
		
		System.out.println("--------排序之后---------");
	    Arrays.sort(stus);
	    for(Students s: stus)
		{
			System.out.println(s);
		}
	
	}

}

import java.util.HashSet;
import java.util.Iterator;

class Person{
	
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "������"+this.name+",���䣺"+this.age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode()+this.age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person)
		{
			Person p = (Person)obj;
			//������������䶼��ȣ�����Ϊ����������equals
			if(this.name.equals(p.name)&&this.age==p.age)
		    {
				return true; //��������ظ��Ķ���
		    }
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	
}  

public class Test {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add(new Person("������",60));
		set.add(new Person("����",30));
		set.add(new Person("������",60));
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

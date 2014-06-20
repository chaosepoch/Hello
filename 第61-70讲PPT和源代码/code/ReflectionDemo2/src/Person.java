import java.io.Serializable;
import java.lang.reflect.Method;

//人类
public class Person implements Serializable,Comparable{

	private String name; //姓名
	private int age;//年龄
	public String address;//地址
	double salary;//工资;

    	
	public Person()
	{
		
	}
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	Person(String name)
	{
		this.name = name;
	}
	
	private Person(int age)
	{
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

    public String toString()
    {
    	return "姓名："+this.getName()+"，年龄："+this.getAge();
    }
    
    public void sayHello(String name)
    {
    	System.out.println("你好,"+name);
    }
    
    private void smoking()
    {
    	System.out.println("吸烟有害健康...");
    }
    
    public static void main(String[] args) throws Exception{
		Class<?> c = Class.forName("Person");
		Method m = c.getDeclaredMethod("smoking", new Class[]{});
		Person p = (Person)c.newInstance();
 	    
 	    m.invoke(p, null); //方法调用
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

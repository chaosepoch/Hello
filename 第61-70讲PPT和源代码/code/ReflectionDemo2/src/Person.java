import java.io.Serializable;
import java.lang.reflect.Method;

//����
public class Person implements Serializable,Comparable{

	private String name; //����
	private int age;//����
	public String address;//��ַ
	double salary;//����;

    	
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
    	return "������"+this.getName()+"�����䣺"+this.getAge();
    }
    
    public void sayHello(String name)
    {
    	System.out.println("���,"+name);
    }
    
    private void smoking()
    {
    	System.out.println("�����к�����...");
    }
    
    public static void main(String[] args) throws Exception{
		Class<?> c = Class.forName("Person");
		Method m = c.getDeclaredMethod("smoking", new Class[]{});
		Person p = (Person)c.newInstance();
 	    
 	    m.invoke(p, null); //��������
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

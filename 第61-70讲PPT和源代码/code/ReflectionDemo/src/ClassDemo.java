
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        Class<?> c4 = null;
        
        //方式一：使用对象的getClass()
        Person p = new Person();
        c1 = p.getClass();
        
        //方式二：使用static method Class.forName()（最常被使用）
        try
        {
        	c2 = Class.forName("Person");
        }
        catch(ClassNotFoundException ex)
        {
        	ex.printStackTrace();
        }
        
        //方式三：使用.class语法
        c3 = Person.class;
        
        //方式四：如果是JAVA封装类型，使用TYPE语法
        c4 = Integer.TYPE;
        
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        
 	}

}

import java.lang.reflect.Constructor;


public class DynamicInstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<?> c = null;
        try
        {
        	c = Class.forName("Person");
        	Constructor constru = c.getConstructor(new Class[]{String.class,int.class});
            //使用反射机制，动态实例化对象。
        	Person p = (Person)constru.newInstance("张三丰",60);
            System.out.println(p);
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}

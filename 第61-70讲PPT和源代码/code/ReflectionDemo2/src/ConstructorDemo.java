import java.lang.reflect.Constructor;


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
		    Class<?> c = Class.forName("Person");
            //获得所有公有的构造方法
		    System.out.println("所有公有的构造方法：");
		    Constructor[] constructors = c.getConstructors();
		    for(int i=0;i<constructors.length;i++)
		    {
		    	System.out.println(constructors[i].toGenericString());
		    }
            //获得指定参数类型的公有的构造方法
		    System.out.println("指定参数类型的公有的构造方法：");
		    try
		    {
		       //Constructor constru = c.getConstructor(new Class[]{String.class,Integer.class});
		    	Constructor constru = c.getConstructor(new Class[]{String.class,int.class});
		    	System.out.println(constru.toGenericString());
		    }
		    catch(Exception ex)
		    {
		    	System.out.println("指定类型的构造方法不存在！");
		    }
		    
		    //获得指定参数类型的公有的构造方法，不限制访问级别
		    System.out.println("指定参数类型的构造方法：");
		    try
		    {
		    	Constructor constru = c.getDeclaredConstructor(new Class[]{int.class});
		    	System.out.println(constru.toGenericString());
		    }
		    catch(Exception ex)
		    {
		    	ex.printStackTrace();
		    }
		    //获得所有的构造方法
		    System.out.println("所有的构造方法：");
		    constructors = c.getDeclaredConstructors();
		    for(int i=0;i<constructors.length;i++)
		    {
		    	System.out.println(constructors[i].toGenericString());
		    }
        }
        catch(ClassNotFoundException ex)
        {
        	ex.printStackTrace();
        }
	}

}

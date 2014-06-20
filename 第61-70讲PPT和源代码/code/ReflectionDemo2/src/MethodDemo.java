import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c = null;
	       try
	       {
	    	   c = Class.forName("Person");
	    	   //获得所有公有的属性信息
	    	   System.out.println("获得所有公有的方法：");
	    	   
	    	   Method[] methods = c.getMethods();
	    	   //包括了从父类或者接口继承过来的公有的方法。
	    	   for(int i=0;i<methods.length;i++)
	    	   {
	    		   System.out.println(methods[i].toGenericString());
	    	   }
	    	   
	    	   System.out.println("获得所有的成员方法：");
	    	   methods = c.getDeclaredMethods();
	    	   for(int i=0;i<methods.length;i++)
	    	   {
	    		   System.out.println(methods[i].toGenericString());
	    	   }
	    	   
	    	   System.out.println("获得指定参数类型的公有的成员方法：");
	    	   Method m = c.getMethod("sayHello", new Class[]{String.class});
	    	   System.out.println(m.toGenericString());
	    	   
	    	   System.out.println("获得指定参数类型的成员方法：");
	    	   m = c.getDeclaredMethod("smoking", new Class[]{});
	    	   System.out.println(m.toGenericString());
	    	   
	    	   /*
	    	   System.out.println("调用抽烟私有方法：");
	    	   Person p = (Person)c.newInstance();
	    	   //注意，因为smoking方法是私有，所以只能在本类中调用;
	    	   m.invoke(p, null); //方法调用
	    	   */
	    	   Person p = (Person)c.newInstance();
	    	   
	    	   m = c.getMethod("sayHello", new Class[]{String.class});
	    	   System.out.println("调用sayHello方法：");
	    	   m.invoke(p, "张三");
	       }
	       catch(Exception ex)
	       {
	    	   
	       }
	}

}

import java.lang.reflect.Field;


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Class<?> c = null;
	       try
	       {
	    	   c = Class.forName("Person");
	    	   //获得所有公有的属性信息
	    	   System.out.println("获得所有接口信息：");
	    	   Class[] interfaces = c.getInterfaces();
	    	   for(int i=0;i<interfaces.length;i++)
	    	   {
	    		   System.out.println(interfaces[i].toString());
	    	   }
	       }
	       catch(Exception ex)
	       {
	    	   
	       }
	}

}

import java.lang.reflect.Field;


public class FieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Class<?> c = null;
       try
       {
    	   c = Class.forName("Person");
    	   //获得所有公有的属性信息
    	   System.out.println("获得所有公有的属性：");
    	   Field[] fields = c.getFields();
    	   for(int i=0;i<fields.length;i++)
    	   {
    		   System.out.println(fields[i].toGenericString());
    	   }
    	   
    	   System.out.println("获得所有的属性：");
    	   fields = c.getDeclaredFields();
    	   for(int i=0;i<fields.length;i++)
    	   {
    		   System.out.println(fields[i].toGenericString());
    	   }
    	   Field f =  c.getField("address");
    	   System.out.println("获得指定名字的公有的属性:");
    	   System.out.println(f.toGenericString());
    	   
    	   System.out.println("获得指定名字的属性:");
    	   f = c.getDeclaredField("name");
    	   System.out.println(f.toGenericString());
    	   
       }
       catch(Exception ex)
       {
    	   
       }
	}

}

import java.lang.reflect.Field;


public class FieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Class<?> c = null;
       try
       {
    	   c = Class.forName("Person");
    	   //������й��е�������Ϣ
    	   System.out.println("������й��е����ԣ�");
    	   Field[] fields = c.getFields();
    	   for(int i=0;i<fields.length;i++)
    	   {
    		   System.out.println(fields[i].toGenericString());
    	   }
    	   
    	   System.out.println("������е����ԣ�");
    	   fields = c.getDeclaredFields();
    	   for(int i=0;i<fields.length;i++)
    	   {
    		   System.out.println(fields[i].toGenericString());
    	   }
    	   Field f =  c.getField("address");
    	   System.out.println("���ָ�����ֵĹ��е�����:");
    	   System.out.println(f.toGenericString());
    	   
    	   System.out.println("���ָ�����ֵ�����:");
    	   f = c.getDeclaredField("name");
    	   System.out.println(f.toGenericString());
    	   
       }
       catch(Exception ex)
       {
    	   
       }
	}

}

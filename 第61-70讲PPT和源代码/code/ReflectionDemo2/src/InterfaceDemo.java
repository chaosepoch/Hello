import java.lang.reflect.Field;


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Class<?> c = null;
	       try
	       {
	    	   c = Class.forName("Person");
	    	   //������й��е�������Ϣ
	    	   System.out.println("������нӿ���Ϣ��");
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

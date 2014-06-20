import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c = null;
	       try
	       {
	    	   c = Class.forName("Person");
	    	   //������й��е�������Ϣ
	    	   System.out.println("������й��еķ�����");
	    	   
	    	   Method[] methods = c.getMethods();
	    	   //�����˴Ӹ�����߽ӿڼ̳й����Ĺ��еķ�����
	    	   for(int i=0;i<methods.length;i++)
	    	   {
	    		   System.out.println(methods[i].toGenericString());
	    	   }
	    	   
	    	   System.out.println("������еĳ�Ա������");
	    	   methods = c.getDeclaredMethods();
	    	   for(int i=0;i<methods.length;i++)
	    	   {
	    		   System.out.println(methods[i].toGenericString());
	    	   }
	    	   
	    	   System.out.println("���ָ���������͵Ĺ��еĳ�Ա������");
	    	   Method m = c.getMethod("sayHello", new Class[]{String.class});
	    	   System.out.println(m.toGenericString());
	    	   
	    	   System.out.println("���ָ���������͵ĳ�Ա������");
	    	   m = c.getDeclaredMethod("smoking", new Class[]{});
	    	   System.out.println(m.toGenericString());
	    	   
	    	   /*
	    	   System.out.println("���ó���˽�з�����");
	    	   Person p = (Person)c.newInstance();
	    	   //ע�⣬��Ϊsmoking������˽�У�����ֻ���ڱ����е���;
	    	   m.invoke(p, null); //��������
	    	   */
	    	   Person p = (Person)c.newInstance();
	    	   
	    	   m = c.getMethod("sayHello", new Class[]{String.class});
	    	   System.out.println("����sayHello������");
	    	   m.invoke(p, "����");
	       }
	       catch(Exception ex)
	       {
	    	   
	       }
	}

}

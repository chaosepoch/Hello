
public class SuperClassDemo {
   
   public static void main(String[] args) {
	
	   Class<?> c = null;
       try
       {
    	   c = Class.forName("Person");
    	   //������й��е�������Ϣ
    	   System.out.println("�����������Ϣ��");
    	   Class sc = c.getSuperclass();
    	   System.out.println(sc.toString());
       }
       catch(Exception ex)
       {
    	   
       }
   }
}

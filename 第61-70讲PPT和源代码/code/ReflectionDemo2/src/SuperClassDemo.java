
public class SuperClassDemo {
   
   public static void main(String[] args) {
	
	   Class<?> c = null;
       try
       {
    	   c = Class.forName("Person");
    	   //获得所有公有的属性信息
    	   System.out.println("获得所父类信息：");
    	   Class sc = c.getSuperclass();
    	   System.out.println(sc.toString());
       }
       catch(Exception ex)
       {
    	   
       }
   }
}

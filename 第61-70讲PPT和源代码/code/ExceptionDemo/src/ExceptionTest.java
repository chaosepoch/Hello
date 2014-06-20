class Person
{
   Person()
   {
	   
   }
   public void sayHello()
   {
	   System.out.println("大家好...");
   }
}


public class ExceptionTest {
    
	public static Person p; //这个引用不指向任何对象。
	
	public static void fn()
	{
	  try
	  {
		p.sayHello(); //会抛出NullPointerException,属于运行时异常。
		
	  }
	  catch(Exception ex)
	  {
		  System.out.println("程序即将退出...");
		  System.exit(0); //无条件退出程序。
		  //return;
	  }
	  finally
	  {
		  System.out.println("我一定要执行...."); //碰到return语句也会执行。
	  }
	}
	
	
	
	public static void main(String[] args) {
	   
		try
		{
		    int x =10;
		    int y =0;
		    //Person p = new Person();
		    int arr[] = {1,2,3};
		    
		    Person p; //
		    ExceptionTest.fn();
		    
		    //System.out.println(x/y); //在运行时会抛出异常。
		    System.out.println(arr[3]); //打印第四个元素。会抛出IndexOutOfBoundsException。
		    
			Class.forName("cn.com.A"); //加载cn.com.A类
		
		}
		catch(ArithmeticException ex)
		{
			System.out.println("分母不能为零！");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
			System.out.println("加载异常！");
		}
		finally
		{
			System.out.println("我一定要执行....");
		}
		
	}

}

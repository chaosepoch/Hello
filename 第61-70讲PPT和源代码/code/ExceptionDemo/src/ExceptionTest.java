class Person
{
   Person()
   {
	   
   }
   public void sayHello()
   {
	   System.out.println("��Һ�...");
   }
}


public class ExceptionTest {
    
	public static Person p; //������ò�ָ���κζ���
	
	public static void fn()
	{
	  try
	  {
		p.sayHello(); //���׳�NullPointerException,��������ʱ�쳣��
		
	  }
	  catch(Exception ex)
	  {
		  System.out.println("���򼴽��˳�...");
		  System.exit(0); //�������˳�����
		  //return;
	  }
	  finally
	  {
		  System.out.println("��һ��Ҫִ��...."); //����return���Ҳ��ִ�С�
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
		    
		    //System.out.println(x/y); //������ʱ���׳��쳣��
		    System.out.println(arr[3]); //��ӡ���ĸ�Ԫ�ء����׳�IndexOutOfBoundsException��
		    
			Class.forName("cn.com.A"); //����cn.com.A��
		
		}
		catch(ArithmeticException ex)
		{
			System.out.println("��ĸ����Ϊ�㣡");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
			System.out.println("�����쳣��");
		}
		finally
		{
			System.out.println("��һ��Ҫִ��....");
		}
		
	}

}

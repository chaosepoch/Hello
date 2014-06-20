import java.lang.reflect.Constructor;


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
		    Class<?> c = Class.forName("Person");
            //������й��еĹ��췽��
		    System.out.println("���й��еĹ��췽����");
		    Constructor[] constructors = c.getConstructors();
		    for(int i=0;i<constructors.length;i++)
		    {
		    	System.out.println(constructors[i].toGenericString());
		    }
            //���ָ���������͵Ĺ��еĹ��췽��
		    System.out.println("ָ���������͵Ĺ��еĹ��췽����");
		    try
		    {
		       //Constructor constru = c.getConstructor(new Class[]{String.class,Integer.class});
		    	Constructor constru = c.getConstructor(new Class[]{String.class,int.class});
		    	System.out.println(constru.toGenericString());
		    }
		    catch(Exception ex)
		    {
		    	System.out.println("ָ�����͵Ĺ��췽�������ڣ�");
		    }
		    
		    //���ָ���������͵Ĺ��еĹ��췽���������Ʒ��ʼ���
		    System.out.println("ָ���������͵Ĺ��췽����");
		    try
		    {
		    	Constructor constru = c.getDeclaredConstructor(new Class[]{int.class});
		    	System.out.println(constru.toGenericString());
		    }
		    catch(Exception ex)
		    {
		    	ex.printStackTrace();
		    }
		    //������еĹ��췽��
		    System.out.println("���еĹ��췽����");
		    constructors = c.getDeclaredConstructors();
		    for(int i=0;i<constructors.length;i++)
		    {
		    	System.out.println(constructors[i].toGenericString());
		    }
        }
        catch(ClassNotFoundException ex)
        {
        	ex.printStackTrace();
        }
	}

}

import java.lang.reflect.Constructor;


public class DynamicInstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<?> c = null;
        try
        {
        	c = Class.forName("Person");
        	Constructor constru = c.getConstructor(new Class[]{String.class,int.class});
            //ʹ�÷�����ƣ���̬ʵ��������
        	Person p = (Person)constru.newInstance("������",60);
            System.out.println(p);
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}

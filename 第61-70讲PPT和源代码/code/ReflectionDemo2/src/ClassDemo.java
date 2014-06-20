
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        Class<?> c4 = null;
        
        //��ʽһ��ʹ�ö����getClass()
        Person p = new Person();
        c1 = p.getClass();
        
        //��ʽ����ʹ��static method Class.forName()�����ʹ�ã�
        try
        {
        	c2 = Class.forName("Person");
        }
        catch(ClassNotFoundException ex)
        {
        	ex.printStackTrace();
        }
        
        //��ʽ����ʹ��.class�﷨
        c3 = Person.class;
        
        //��ʽ�ģ������JAVA��װ���ͣ�ʹ��TYPE�﷨
        c4 = Integer.TYPE;
        
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        
 	}

}

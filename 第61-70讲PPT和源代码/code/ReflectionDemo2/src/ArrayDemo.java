import java.lang.reflect.Array;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person[] persons = new Person[]{
        		
        		new Person("����",18),
        		new Person("����",19),
        		new Person("����",20)
        };
        
        System.out.println("��������ĳ��ȣ�"+Array.getLength(persons));
        
        Class c = persons.getClass();
        Class c2 = Person.class;
        System.out.println("�Ƿ����������ͣ�"+c.isArray());
        System.out.println("�Ƿ����������ͣ�"+c2.isArray());
        
        //ʹ��Array���������
        for(int i=0;i<Array.getLength(persons);i++)
        {
        	System.out.println(Array.get(persons, i));
        }
	}

}

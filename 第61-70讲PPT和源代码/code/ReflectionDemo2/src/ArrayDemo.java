import java.lang.reflect.Array;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person[] persons = new Person[]{
        		
        		new Person("张三",18),
        		new Person("李四",19),
        		new Person("王五",20)
        };
        
        System.out.println("对象数组的长度："+Array.getLength(persons));
        
        Class c = persons.getClass();
        Class c2 = Person.class;
        System.out.println("是否是数组类型："+c.isArray());
        System.out.println("是否是数组类型："+c2.isArray());
        
        //使用Array类遍历数组
        for(int i=0;i<Array.getLength(persons);i++)
        {
        	System.out.println(Array.get(persons, i));
        }
	}

}

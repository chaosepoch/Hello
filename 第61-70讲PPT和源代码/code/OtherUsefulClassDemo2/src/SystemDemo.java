import java.util.Scanner;

class Person
{
   	String name;
   	int age;
   	
   	Person(String name,int age)
   	{
   		this.name = name;
   		this.age = age;
   	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("一个人类对象即将销毁....");
	}
   	
   	
}


public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("hello");//标准的输出流对象out
       Scanner in = new Scanner(System.in); //标准的输入流in
       System.err.println("this is a error!");
       //System.exit(0);//0：表示正常退出。当前运行的程序无条件退出。
       
       System.getProperties().list(System.out);
       System.out.println("------------------");
       System.out.println(System.getProperty("os.name")); //打印操作系统的名字
       /*
       long startTime = System.currentTimeMillis();//程序开始时间
       for(int i=0;i<10000;i++)
       {
    	   System.out.println(i);
       }
       long endTime = System.currentTimeMillis();
       System.out.println("程序运行时间为："+(endTime-startTime)+"ms");
       */
       
       Person p = new Person("张三",30);
       p = null;
       System.gc();//调用垃圾回收器
	}

}

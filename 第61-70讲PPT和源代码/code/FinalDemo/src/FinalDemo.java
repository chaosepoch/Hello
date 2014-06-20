class Person
{
   String name;
   int age;
    
   Person()
   {
	   
   }
   
   Person(String name,int age)
   {
	   this.name = name;
	   this.age = age;
   }
   public void showInfo()
   {
	   System.out.println("姓名："+this.name+"，年龄："+this.age);
   }
}


public class FinalDemo {

	//final int NUM =100; //定义的同时，进行初始化。
	final int NUM;
	
	final Person p;
	
	FinalDemo()
	{
		this.NUM=100; //在构造方法当中初始化
		this.p = new Person("无名氏",20);
	}
	
	public void change(final Person p)
	{
		//p.name = "张三丰"; //正确的，对象的值可以改变。
		//p = new Person("张三丰",60);错误，对象不可以改变
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FinalDemo f = new FinalDemo();
        //f.NUM = 50; //错误，final类型不可改变
        
        //f.p.name = "张三丰"; //正确的，对象的值可以改变。
        //f.p.showInfo();
        
        //f.p = new Person("张三丰",60);错误，对象不可改变。
        Person p = new Person("张飞",30);
        f.change(p);
        p.showInfo();
	}

}

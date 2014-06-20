//图书
class Books{
	String name;//书名
	String author;//作者
    String press;//出版社
    String lender;//借书人
    
    Books(String name,String author,String press)
    {
    	this.name = name;
    	this.author = author;
    	this.press = press;
    	this.lender = "无名氏";
    }
    
    public void showInfo()
    {
    	System.out.println("书名："+this.name+"，借书人："+this.lender);
    }
}

//学生类
public class Students {
   
	String sid;//学号
	String name;//姓名
	int age;//年龄
	
	Students(String sid,String name,int age)
	{
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	public void lendBook(Books book)
	{
	    //book.lender = this.name;
		book = new Books("java设计模式","四人帮","清华大学出版社");
		book.lender = this.name;
	}
	
	public static void main(String[] args)
	{
		Books b = new Books("java编程思想","侯敏","电子工业出版社");
		Students s = new Students("S0001","李明",20);
		b.showInfo();
		s.lendBook(b);
		System.out.println("---------借书之后-----------");
		b.showInfo();
	}
}

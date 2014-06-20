
public class Books {

	String name;//书名
	String press;//出版社
	double price;//价格
	
	Books(String name,String press,double price)
	{
		this.name = name;
		this.press = press;
		this.price = price;
	}
	
	//返回图书的基本信息
	public String showInfo()
	{
		return "书名："+this.name+",出版社："+this.press+",价格："+this.price;
	}
	
	/*
	public String toString()
	{
		return "书名："+this.name+",出版社："+this.press+",价格："+this.price;
	}*/
}

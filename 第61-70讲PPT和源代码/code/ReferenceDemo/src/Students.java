//ͼ��
class Books{
	String name;//����
	String author;//����
    String press;//������
    String lender;//������
    
    Books(String name,String author,String press)
    {
    	this.name = name;
    	this.author = author;
    	this.press = press;
    	this.lender = "������";
    }
    
    public void showInfo()
    {
    	System.out.println("������"+this.name+"�������ˣ�"+this.lender);
    }
}

//ѧ����
public class Students {
   
	String sid;//ѧ��
	String name;//����
	int age;//����
	
	Students(String sid,String name,int age)
	{
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	public void lendBook(Books book)
	{
	    //book.lender = this.name;
		book = new Books("java���ģʽ","���˰�","�廪��ѧ������");
		book.lender = this.name;
	}
	
	public static void main(String[] args)
	{
		Books b = new Books("java���˼��","����","���ӹ�ҵ������");
		Students s = new Students("S0001","����",20);
		b.showInfo();
		s.lendBook(b);
		System.out.println("---------����֮��-----------");
		b.showInfo();
	}
}

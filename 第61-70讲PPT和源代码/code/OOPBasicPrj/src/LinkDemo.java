//学生类
class Students
{
   String name; //姓名
   int age;//年龄
   
   Students(String name,int age)
   {
	   this.name = name;
	   this.age = age;
   }
   
   public void showInfo()
   {
	   System.out.println("姓名："+this.name+"，年龄："+this.age);
   }
}

//结点类
class Node{
   Students data; //数据域
   Node next;  //指向下一个结点的指针域
   
   Node()
   {
	   
   }
   
   Node(Students data)
   {
	   this.data = data;
	   this.next = null;
   }
}

//单向链表类
public class LinkDemo {

	//初始化方法
	public static void init(Students[] stus,Node root)
	{
		Node temp = root;
		for(Students s:stus)
		{
			//生成一个新结点
			Node node = new Node(s);
			temp.next = node;
			temp = temp.next;
		}
	}
	//遍历方法
	public static void iterator(Node root)
	{
		Node temp = root;
		while(temp.next!=null)
		{
			temp = temp.next;
			temp.data.showInfo();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Students[] stus = {
        		new Students("张三",18),
        		new Students("李四",23),
        		new Students("王五",24),
        		new Students("赵六",19),
        		new Students("孙七",20)
        };
        //生成一个头结点
        Node root = new Node();
        LinkDemo.init(stus, root);
        LinkDemo.iterator(root);
	}

}

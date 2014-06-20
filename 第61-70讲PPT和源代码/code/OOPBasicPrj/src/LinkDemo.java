//ѧ����
class Students
{
   String name; //����
   int age;//����
   
   Students(String name,int age)
   {
	   this.name = name;
	   this.age = age;
   }
   
   public void showInfo()
   {
	   System.out.println("������"+this.name+"�����䣺"+this.age);
   }
}

//�����
class Node{
   Students data; //������
   Node next;  //ָ����һ������ָ����
   
   Node()
   {
	   
   }
   
   Node(Students data)
   {
	   this.data = data;
	   this.next = null;
   }
}

//����������
public class LinkDemo {

	//��ʼ������
	public static void init(Students[] stus,Node root)
	{
		Node temp = root;
		for(Students s:stus)
		{
			//����һ���½��
			Node node = new Node(s);
			temp.next = node;
			temp = temp.next;
		}
	}
	//��������
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
        		new Students("����",18),
        		new Students("����",23),
        		new Students("����",24),
        		new Students("����",19),
        		new Students("����",20)
        };
        //����һ��ͷ���
        Node root = new Node();
        LinkDemo.init(stus, root);
        LinkDemo.iterator(root);
	}

}

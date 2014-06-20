import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PokerDemo {

	private static String[] roles={"����","��Ƭ","����","÷��"};
	private static String[] hands=new String[4]; //ÿ��������е���
	//52���˿���
	private static ArrayList<String> pokers = new ArrayList<String>();
	
	//��ʼ������
	public static void init()
	{
		for(String role:roles)
		{
			for(int i=1;i<=13;i++)
			{
				String s="";
				s=i+"";
				if(i==1)
				{
					s="A";
				}
				if(i==11)
				{
					s="J";
				}
				if(i==12)
				{
					s="Q";
				}
				if(i==13)
				{
					s="K";
				}
				pokers.add(role+""+s);
			}
		}
		//���ĸ�������е��ƽ��г�ʼ����
		for(int i=0;i<hands.length;i++)
		{
			hands[i]="";
		}
	}
 
	//���ĸ���ҷ���
	public static void getHands()
	{
		for(int i=0;i<hands.length;i++)
		{
		   //����ִ�
		   List<String> temp = pokers.subList(0, 13);
		   ArrayList<String> list = new ArrayList<String>(temp);
		   for(String s:list)
		   {
			   hands[i]+=s+" ";
		   }
		   
		   temp.clear();//����ִ�
		}
	}
	
	public static void main(String[] args) {
		
		PokerDemo.init();
		for(String s:pokers)
		{
			System.out.print(s+" ");
		}
		//ʹ��Collections.shuffle()���Ҽ��ϴ���.
		Collections.shuffle(pokers);
		System.out.println("\n----------ϴ��֮��---------\n");
		for(String s:pokers)
		{
			System.out.print(s+" ");
		}
		System.out.println("\n----------������е����ǣ�---------\n");
		PokerDemo.getHands();//��ʼ����
		for(int i=0;i<hands.length;i++)
		{
			System.out.println("��"+(i+1)+"��������е����ǣ�"+hands[i]);
		}
	}

}

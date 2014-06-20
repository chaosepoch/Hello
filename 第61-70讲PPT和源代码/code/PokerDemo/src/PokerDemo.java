import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PokerDemo {

	private static String[] roles={"红桃","方片","黑桃","梅花"};
	private static String[] hands=new String[4]; //每个玩家手中的牌
	//52张扑克牌
	private static ArrayList<String> pokers = new ArrayList<String>();
	
	//初始化方法
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
		//对四个玩家手中的牌进行初始化。
		for(int i=0;i<hands.length;i++)
		{
			hands[i]="";
		}
	}
 
	//给四个玩家发牌
	public static void getHands()
	{
		for(int i=0;i<hands.length;i++)
		{
		   //获得字串
		   List<String> temp = pokers.subList(0, 13);
		   ArrayList<String> list = new ArrayList<String>(temp);
		   for(String s:list)
		   {
			   hands[i]+=s+" ";
		   }
		   
		   temp.clear();//清除字串
		}
	}
	
	public static void main(String[] args) {
		
		PokerDemo.init();
		for(String s:pokers)
		{
			System.out.print(s+" ");
		}
		//使用Collections.shuffle()打乱集合次序.
		Collections.shuffle(pokers);
		System.out.println("\n----------洗牌之后---------\n");
		for(String s:pokers)
		{
			System.out.print(s+" ");
		}
		System.out.println("\n----------玩家手中的牌是：---------\n");
		PokerDemo.getHands();//开始发牌
		for(int i=0;i<hands.length;i++)
		{
			System.out.println("第"+(i+1)+"个玩家手中的牌是："+hands[i]);
		}
	}

}

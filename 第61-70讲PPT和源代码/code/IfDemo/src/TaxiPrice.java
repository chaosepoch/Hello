import java.util.Scanner;


public class TaxiPrice {
	
	public static void main(String[] args) {
       
		double totalPrice;//总费用
		int startPrice;//起步价
		int hours;//打出的时间
		int distance;//打车的距离
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您打出的时间(0-23):");
		hours = in.nextInt();
		System.out.println("请输入您打出的距离:");
		distance = in.nextInt();
		
		//首先判断起步价
		if(hours>=6&&hours<=21)
		{
			startPrice = 6;
		}
		else
		{
			startPrice = 7;
		}
		//判断是否超出两公里
        if(distance > 2)
        {
        	totalPrice = startPrice + (distance -2)* 1.5;
        }
        else
        {
        	totalPrice = startPrice;
        }
        totalPrice++; //一元钱的燃油附加税
        System.out.println("您这次乘车的总费用是："+totalPrice+"￥");
	}

}

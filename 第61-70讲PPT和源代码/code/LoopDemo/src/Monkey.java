
public class Monkey {

	public static void main(String[] args) {
		
		int totalPear=1;//总桃子数
		int day=10; //从第十天开始推算
		while(day>1)
		{
			totalPear=(totalPear+1)*2; //前一天的桃子数=(后一天的桃子数+1)*2;
			day--;
		}
		System.out.println("猴子第一天摘了:"+totalPear+"个桃子！");
	}

}

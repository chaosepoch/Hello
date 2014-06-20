import java.util.Scanner;


public class Test3 {
	
	/*
	 * 1.百米赛跑的成绩，小于12秒，则进入决赛。
	 * 
	 * 2.如果性别为男，进进入男子组决赛，如果性别为女，则进入女子组决赛
	 * 
	 * */
	
	public static void main(String[] args) {
	   
		int second;//跑了多少秒钟。
		String gender;//性别；
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您的性别(男/女)：");
		gender = in.next();
		System.out.println("请入您的百米成绩(秒):");
		second = in.nextInt();
		
		if(second<12)
		{
			if(gender.equals("男"))
			{
				System.out.println("恭喜你，进入男子组决赛！");
			}
			else
			{
				System.out.println("恭喜你，进入女子组决赛！");
			}
		}
		else
		{
			System.out.println("很遗憾，您未能进入决赛！");
		}
	}

}

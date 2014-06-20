import java.util.Scanner;


public class Test3 {

	public static void main(String[] args) {
		
		int score;//小明的考试分数
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("请输入考试成绩：");
			score = in.nextInt();
		}while(score!=100);
		
		System.out.println("奖励变形金刚一个！");
	}

}

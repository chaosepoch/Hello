import java.util.Scanner;


public class Test2 {

	/*
	 * 考试成绩的等级划分。
	 * 90-100:成绩优秀
	 * 80-89:成绩良好
	 * 60-79:成绩及格
	 * <60：成绩不及格
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int score;//考试成绩
       Scanner in = new Scanner(System.in);
       System.out.println("请输入您的考试成绩：");
       score = in.nextInt();
       
       if(score>100||score<0)
       {
    	   System.out.println("成绩非法！");
    	   System.exit(0); //表示程序的退出。
       }
       
       if(score>=90&&score<=100)
       {
    	   System.out.println("成绩优秀！");
       }
       else if(score>=80&&score<=89)
       {
    	   System.out.println("成绩良好！");
       }
       else if(score>=60&&score<=79)
       {
    	   System.out.println("成绩及格！");
       }
       else
       {
    	   System.out.println("不及格！");
       }
	}

}

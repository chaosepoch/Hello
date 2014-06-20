import java.util.Scanner;


public class Test4 {
	/*
	 * 考试成绩的等级划分。
	 * 90-100:成绩优秀    100/10  ->10  91/10-->9
	 * 80-89:成绩良好   8
	 * 60-79:成绩及格  6,7
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
	    
	    switch(score/10)
	    {
	       case 10:
	       case 9:
	    	   System.out.println("成绩优秀！");
	    	   break;
	       case 8:
	    	   System.out.println("成绩良好！");
	    	   break;
	       case 7:
	       case 6:
	    	   System.out.println("成绩及格！");
	    	   break;
	       default:
	    	   System.out.println("不及格！");
	    	   break;
	    }
	}

}

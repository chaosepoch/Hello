import java.util.Scanner;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
       * 如果明天不下雨，我们去爬翠华山。
       * 否则，去网吧上网。
       * */
	   boolean isWater ;//表示是否下雨。	
	   System.out.println("明天下雨吗？(true/false):");
	   Scanner in = new Scanner(System.in);
	   isWater = in.nextBoolean();
	   if(isWater)
	   {
		   System.out.println("在网吧上网！");
	   }
	   else
	   {
		   System.out.println("去爬翠华山！");
	   }
	}

}

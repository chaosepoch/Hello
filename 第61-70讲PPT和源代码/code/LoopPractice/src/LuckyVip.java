import java.math.BigInteger;
import java.util.Scanner;


public class LuckyVip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sid ;//身份证号码
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您的身份证号码：");
        sid = in.next();
        BigInteger id = new BigInteger(sid);
	    int temp = 0;
        
        do{
           temp+=id.mod(new BigInteger("10")).intValue(); 	
           id = id.divide(new BigInteger("10"));
           if(id.intValue()==0)
           {
        	   break;
           }
        }while(true);
        
        if(temp%13==0)
        {
        	System.out.println("恭喜您成为幸运用户，奖励iPhone手机一部！");
        }
        else
        {
        	System.out.println("很遗憾，下次好运！");
        }
	}

}

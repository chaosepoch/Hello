import java.util.Random;


public class RandomDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Random r = new Random();
       Random r = new Random();
       for(int i=0;i<100;i++)
       {
	     System.out.println(r.nextInt(100));//0-100之间的随机整数,包括0，但是不包括100.
       }
       
       System.out.println("-----------------");
       for(int i=0;i<100;i++)
       {
	     System.out.println(r.nextDouble());//0-1之间的随机小数.
       }
       
	}

}

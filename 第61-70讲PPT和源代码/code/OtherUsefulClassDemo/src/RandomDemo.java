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
	     System.out.println(r.nextInt(100));//0-100֮����������,����0�����ǲ�����100.
       }
       
       System.out.println("-----------------");
       for(int i=0;i<100;i++)
       {
	     System.out.println(r.nextDouble());//0-1֮������С��.
       }
       
	}

}


public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x = 10;
       int y = 7;
       int temp;
       System.out.println("x="+x+",y="+y);
       System.out.println("---------½»»»Ö®ºó------------");
       /*
       x = x+y; //x=17
       y = x-y; //y=10;
       x = x-y; //x=7;*/
       
       x = x ^ y;
       y = x ^ y;
       x = x ^ y;
       
       System.out.println("x="+x+",y="+y);
	}

}

import java.util.Date;


public class UtilDateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date d = new Date(); //获得当前日期时间对象。
       System.out.println(d);
       System.out.println(d.getTime());//1970-1-1 00:00:00 到现在过了多少毫秒。
	}

}

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d = new Date();
		System.out.println(sdf.format(d));
		System.out.println("-------------------");
		sdf = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss a");
		System.out.println(sdf.format(d));
		System.out.println("-------------------");
		sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss a");
		System.out.println(sdf.format(d));
	}

}

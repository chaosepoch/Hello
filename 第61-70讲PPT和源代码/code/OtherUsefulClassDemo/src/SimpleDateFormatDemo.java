import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d = new Date();
		System.out.println(sdf.format(d));
		System.out.println("-------------------");
		sdf = new SimpleDateFormat("yyyy��MM��dd��  hh:mm:ss a");
		System.out.println(sdf.format(d));
		System.out.println("-------------------");
		sdf = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss a");
		System.out.println(sdf.format(d));
	}

}

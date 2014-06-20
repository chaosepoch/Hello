import java.text.DecimalFormat;
import java.util.Scanner;


public class DecimalFormatDemo {
	
	public static double getArea(int r)
	{
		return 3.14*r*r;
	}
	
	public static void main(String[] args) {
		int r;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		r = in.nextInt();
		//System.out.println("圆的面积是："+DecimalFormatDemo.getArea(r));
	    
		//#:表示如果这一位存在则显示，如果不存在则不显示。
		//0：表示如果这一位存在则显示，如果不存在则显示为0.
		//
		
		DecimalFormat df = new DecimalFormat("#0.00");
		//df.format(number) 返回字符串类型。
		System.out.println("圆的面积是："+df.format(DecimalFormatDemo.getArea(r)));
	}

}

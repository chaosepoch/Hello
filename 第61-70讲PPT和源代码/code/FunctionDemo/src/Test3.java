import java.util.Scanner;


public class Test3 {

	//求圆的面积
	public static double getArea(int r)
	{
		return 3.14*r*r;
	}
	
	//求圆的周长
	public static double getCircle(int r)
	{
		return 3.14*2*r;
	}
	
	public static void main(String[] args) {
		
		int r;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		r = in.nextInt();
		System.out.println("该圆的面积是："+getArea(r));
		System.out.println("该圆的周长是："+getCircle(r));
		
	}

}

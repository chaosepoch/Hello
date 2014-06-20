import java.util.Scanner;


public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        double d;
        boolean flag;
        String s;
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		num = input.nextInt();
		System.out.println("请输入一个小数：");
		d = input.nextDouble();
		System.out.println("请输入一个布尔类型的值：");
		flag = input.nextBoolean();
		System.out.println("请输入一个字符串：");
		s = input.next();
		
		System.out.println(num);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(s);
	}

}

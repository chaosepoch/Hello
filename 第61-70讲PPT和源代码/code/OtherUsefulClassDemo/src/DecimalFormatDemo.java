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
		System.out.println("������Բ�İ뾶��");
		r = in.nextInt();
		//System.out.println("Բ������ǣ�"+DecimalFormatDemo.getArea(r));
	    
		//#:��ʾ�����һλ��������ʾ���������������ʾ��
		//0����ʾ�����һλ��������ʾ���������������ʾΪ0.
		//
		
		DecimalFormat df = new DecimalFormat("#0.00");
		//df.format(number) �����ַ������͡�
		System.out.println("Բ������ǣ�"+df.format(DecimalFormatDemo.getArea(r)));
	}

}

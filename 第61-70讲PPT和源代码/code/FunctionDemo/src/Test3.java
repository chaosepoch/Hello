import java.util.Scanner;


public class Test3 {

	//��Բ�����
	public static double getArea(int r)
	{
		return 3.14*r*r;
	}
	
	//��Բ���ܳ�
	public static double getCircle(int r)
	{
		return 3.14*2*r;
	}
	
	public static void main(String[] args) {
		
		int r;
		Scanner in = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		r = in.nextInt();
		System.out.println("��Բ������ǣ�"+getArea(r));
		System.out.println("��Բ���ܳ��ǣ�"+getCircle(r));
		
	}

}

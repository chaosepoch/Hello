import java.util.Scanner;


public class JieCheng {

	public static void main(String[] args) {
	
		int n ;
		int result=1;//�׳˵Ľ��
		
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����������");
		n = in.nextInt();
		for(int i=n;i>=1;i--)
		{
			result*=i;  //result= result*i;
		}
		System.out.println(n+"�Ľ׳��ǣ�"+result);
	}

}

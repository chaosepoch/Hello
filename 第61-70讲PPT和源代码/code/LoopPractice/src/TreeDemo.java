import java.util.Scanner;


public class TreeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int height;//���ĸ߶�
		
		Scanner in = new Scanner(System.in);
		System.out.println("������ʥ�����ĸ߶ȣ�");
		height = in.nextInt();
		
		for(int i=1;i<=height;i++)
		{
			//�������ÿ��ǰ��Ŀո�
			for(int j=1;j<=height-i;j++)
			{
				System.out.print(" ");
			}
			
			//���ÿ�е�����
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

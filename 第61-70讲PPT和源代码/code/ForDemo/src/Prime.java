import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
	
		int num;//��ʾҪ�ж�������
		boolean flag=true; //�ȼ���������
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����������");
		num = in.nextInt();
		
		//37����,2,3,4,...36,  2һֱ�����������ƽ������
		
		//for(int i=2;i<num-1;i++)  //����д��Ч��̫�͡�
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0) //˵������������
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+"��������");
		}
		else
		{
			System.out.println(num+"����������");
		}
	}

}

import java.util.Scanner;


public class Test3 {
	
	/*
	 * 1.�������ܵĳɼ���С��12�룬����������
	 * 
	 * 2.����Ա�Ϊ�У����������������������Ա�ΪŮ�������Ů�������
	 * 
	 * */
	
	public static void main(String[] args) {
	   
		int second;//���˶������ӡ�
		String gender;//�Ա�
		
		Scanner in = new Scanner(System.in);
		System.out.println("�����������Ա�(��/Ů)��");
		gender = in.next();
		System.out.println("�������İ��׳ɼ�(��):");
		second = in.nextInt();
		
		if(second<12)
		{
			if(gender.equals("��"))
			{
				System.out.println("��ϲ�㣬���������������");
			}
			else
			{
				System.out.println("��ϲ�㣬����Ů���������");
			}
		}
		else
		{
			System.out.println("���ź�����δ�ܽ��������");
		}
	}

}

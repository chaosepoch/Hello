import java.util.Scanner;


public class TaxiPrice {
	
	public static void main(String[] args) {
       
		double totalPrice;//�ܷ���
		int startPrice;//�𲽼�
		int hours;//�����ʱ��
		int distance;//�򳵵ľ���
		
		Scanner in = new Scanner(System.in);
		System.out.println("�������������ʱ��(0-23):");
		hours = in.nextInt();
		System.out.println("������������ľ���:");
		distance = in.nextInt();
		
		//�����ж��𲽼�
		if(hours>=6&&hours<=21)
		{
			startPrice = 6;
		}
		else
		{
			startPrice = 7;
		}
		//�ж��Ƿ񳬳�������
        if(distance > 2)
        {
        	totalPrice = startPrice + (distance -2)* 1.5;
        }
        else
        {
        	totalPrice = startPrice;
        }
        totalPrice++; //һԪǮ��ȼ�͸���˰
        System.out.println("����γ˳����ܷ����ǣ�"+totalPrice+"��");
	}

}

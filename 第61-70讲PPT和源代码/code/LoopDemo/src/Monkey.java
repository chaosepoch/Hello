
public class Monkey {

	public static void main(String[] args) {
		
		int totalPear=1;//��������
		int day=10; //�ӵ�ʮ�쿪ʼ����
		while(day>1)
		{
			totalPear=(totalPear+1)*2; //ǰһ���������=(��һ���������+1)*2;
			day--;
		}
		System.out.println("���ӵ�һ��ժ��:"+totalPear+"�����ӣ�");
	}

}

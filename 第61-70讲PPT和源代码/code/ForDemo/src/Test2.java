
public class Test2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=40;i++)
		{
			
			if(i==10)
			{
				//System.out.println("���Ӻ�ʹ����������...");
				//break;//�˳�����ѭ����
			    System.out.println("ȥ�Ӹ��绰....");
			    continue; //��������ѭ������ʼһ���µ�ѭ����
			}
			System.out.println("�����"+i+"Ȧ�ˡ�");
		}
		System.out.println("����ѵ�����˽�����");
	}

}

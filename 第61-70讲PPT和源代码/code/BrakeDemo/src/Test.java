
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Brake brake = new Brake();//�������
		//��������
		Kitchen kitchen = new Kitchen(brake);
		//�����߶���
		Productor p = new Productor(kitchen);
		
		//���������߶���
		Consumer c1 = new Consumer(kitchen);
		Consumer c2 = new Consumer(kitchen);
		
		//�����߳�
		Thread mother = new Thread(p,"����");
		//�����߳�
		Thread bigSon = new Thread(c1,"����");
		//С���߳�
		Thread smallSon =new Thread(c2,"С��");
		
		mother.start();//����������������߳�
		bigSon.start();//�������ֳ�������߳�
		smallSon.start();//����С�ֳ�������߳�
		
		try
		{
			mother.join();
			bigSon.join();
			smallSon.join();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		//ͳ�ƽ��
		System.out.println("���ֳ��ˣ�"+Kitchen.bigNum);
		System.out.println("С�ֳ��ˣ�"+Kitchen.smallNum);
		
	}

}

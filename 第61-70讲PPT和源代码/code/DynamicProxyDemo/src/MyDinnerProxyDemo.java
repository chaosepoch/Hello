//������
public class MyDinnerProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinner din = new MyDinner();
		//����ʹ�ô�������Ч��
		//din.haveDinner();
		MyDinnerProxy proxy = new MyDinnerProxy();
		//������һ���������
		din = (Dinner)proxy.bind(din);
		//ִ�д������ķ���
		din.haveDinner();
	}

}

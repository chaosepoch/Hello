
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//��̬��ʼ��
		int[] arr = new int[10]; //������һ������Ϊ10����������
		arr[0] = 100;
		arr[1] = 23;
		arr[2] = -7;
		arr[3] = 56;
		
		//arr[4] = "hello"; //������Ϊ�������Ͳ�һ�¡�
		arr[4] = 'A'; //��ȷ����Ϊchar��int�����໥ת����
		System.out.println("arr����ĳ��ȣ�"+arr.length);
		//arr[10] = 99999;
		//System.out.println("arr[10]="+arr[10]); //���󣬲��ܷ��ʵ�11��Ԫ�ء�
	    System.out.println("arr[5]="+arr[5]);
	}

}

import java.util.Scanner;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
       * ������첻���꣬����ȥ���仪ɽ��
       * ����ȥ����������
       * */
	   boolean isWater ;//��ʾ�Ƿ����ꡣ	
	   System.out.println("����������(true/false):");
	   Scanner in = new Scanner(System.in);
	   isWater = in.nextBoolean();
	   if(isWater)
	   {
		   System.out.println("������������");
	   }
	   else
	   {
		   System.out.println("ȥ���仪ɽ��");
	   }
	}

}

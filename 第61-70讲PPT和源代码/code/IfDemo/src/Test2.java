import java.util.Scanner;


public class Test2 {

	/*
	 * ���Գɼ��ĵȼ����֡�
	 * 90-100:�ɼ�����
	 * 80-89:�ɼ�����
	 * 60-79:�ɼ�����
	 * <60���ɼ�������
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int score;//���Գɼ�
       Scanner in = new Scanner(System.in);
       System.out.println("���������Ŀ��Գɼ���");
       score = in.nextInt();
       
       if(score>100||score<0)
       {
    	   System.out.println("�ɼ��Ƿ���");
    	   System.exit(0); //��ʾ������˳���
       }
       
       if(score>=90&&score<=100)
       {
    	   System.out.println("�ɼ����㣡");
       }
       else if(score>=80&&score<=89)
       {
    	   System.out.println("�ɼ����ã�");
       }
       else if(score>=60&&score<=79)
       {
    	   System.out.println("�ɼ�����");
       }
       else
       {
    	   System.out.println("������");
       }
	}

}

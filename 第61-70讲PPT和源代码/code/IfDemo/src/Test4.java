import java.util.Scanner;


public class Test4 {
	/*
	 * ���Գɼ��ĵȼ����֡�
	 * 90-100:�ɼ�����    100/10  ->10  91/10-->9
	 * 80-89:�ɼ�����   8
	 * 60-79:�ɼ�����  6,7
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
	    
	    switch(score/10)
	    {
	       case 10:
	       case 9:
	    	   System.out.println("�ɼ����㣡");
	    	   break;
	       case 8:
	    	   System.out.println("�ɼ����ã�");
	    	   break;
	       case 7:
	       case 6:
	    	   System.out.println("�ɼ�����");
	    	   break;
	       default:
	    	   System.out.println("������");
	    	   break;
	    }
	}

}

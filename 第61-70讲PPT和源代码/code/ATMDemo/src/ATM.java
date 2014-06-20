import java.util.Scanner;

//��������

public class ATM {

	private static final Scanner in = new Scanner(System.in);
	private static int choice;//�û���ѡ��
	private static Account account;
	
	//��ʾϵͳ�˵�
	public static void showMenu()
	{
		System.out.println("********��ӭʹ��XXX����ATMϵͳ**********");
		System.out.println("\t1.����");
		System.out.println("\t2.��ѯ���");
		System.out.println("\t3.���");
		System.out.println("\t4.ȡ��");
		System.out.println("\t5.�޸�����");
		System.out.println("\t6.�˳�");
		System.out.println("��ѡ��");
		choice = in.nextInt();
	}
	
	//��������
	public static void initAccount()
	{
		account = new Account();
		System.out.println("�����ɹ������������˻�����Ϣ��");
		System.out.println(account);
	}
	
	//��ѯ����
	public static void showBalance()
	{
		System.out.println(account);
	}
	
	//����
	public static boolean deposite(int number)
	{
		try
		{
			if(number<=0)
			{
				throw new ATMException("�����Ƿ���");
			}
			else
			{
				account.setBalance(account.getBalance()+number);
				System.out.println("���ɹ���");
				return true;
			}
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}
	}
	
	//ȡ���
	public static boolean draw(int number)
	{
		try
		{
		   if(number<=0)
		   {
			   throw new ATMException("ȡ����Ƿ���");
		   }
		   else if(number>account.getBalance())
		   {
			   throw new ATMException("ȡ������������㣡");
		   }
		   else
		   {
			   account.setBalance(account.getBalance()-number);
			   System.out.println("ȡ��ɹ���");
			   return true;
		   }
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}
	}
	
	//������֤����
	public static boolean confirmPass(String pass)
	{
		try
		{
			if(pass==null||pass.equals(""))
			{
				throw new ATMException("���벻��Ϊ�գ�");
			}
			else if(!pass.equals(account.getPassword()))
			{
				throw new ATMException("������֤ʧ�ܣ�");
			}
			else
			{
				return true;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return false;
		}
	}
	//�޸����뷽��
	public static boolean changePass(String pass)
	{
		try
		{
			if(pass==null||pass.trim().equals(""))
			{
				throw new ATMException("���벻��Ϊ�գ�");
			}
			else if(pass.length()!=6)
			{
				throw new ATMException("���볤�ȱ�����6λ��");
			}
			else
			{
				account.setPassword(pass);
				System.out.println("�����޸ĳɹ���");
				return true;
			}
		}
		catch(ATMException ex)
		{
			System.out.println(ex);
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ATM.showMenu();
		do
        {
		   if(choice==6) 
		   {
			   break;
		   }
      	   switch(choice)
           {
      	       case 1: 
      	    	   ATM.initAccount();
      	    	   break;
      	       case 2:
      	    	   ATM.showBalance();
      	    	   break;
      	       case 3:
      	    	   System.out.println("���������");
      	    	   int number = in.nextInt();
      	    	   ATM.deposite(number);
      	    	   break;
      	       case 4:
      	    	   System.out.println("������ȡ���");
    	    	   number = in.nextInt();
    	    	   ATM.draw(number);
    	    	   break;
      	       case 5:
      	    	   System.out.println("���������룺");
      	    	   String pass = in.next();
      	    	   if(ATM.confirmPass(pass))
      	    	   {
      	    		   System.out.println("�����������룺");
      	    		   pass = in.next();
      	    		   ATM.changePass(pass);
      	    	   }
      	    	   break;
           }
      	   ATM.showMenu();
        }while(choice!=6);
        System.out.println("��л����ʹ�ã���ӭ�´ι��٣�");
	}

}

import java.math.BigInteger;
import java.util.Scanner;


public class LuckyVip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sid ;//���֤����
        Scanner in = new Scanner(System.in);
        System.out.println("�������������֤���룺");
        sid = in.next();
        BigInteger id = new BigInteger(sid);
	    int temp = 0;
        
        do{
           temp+=id.mod(new BigInteger("10")).intValue(); 	
           id = id.divide(new BigInteger("10"));
           if(id.intValue()==0)
           {
        	   break;
           }
        }while(true);
        
        if(temp%13==0)
        {
        	System.out.println("��ϲ����Ϊ�����û�������iPhone�ֻ�һ����");
        }
        else
        {
        	System.out.println("���ź����´κ��ˣ�");
        }
	}

}

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Date d = new Date();
        Calendar c = Calendar.getInstance();
	    
        System.out.println(c.toString());
        int year = c.get(Calendar.YEAR);//���
        int month = c.get(Calendar.MONTH);//�·�
        int day = c.get(Calendar.DAY_OF_MONTH);//��
        int minute = c.get(Calendar.MINUTE);//����
        int hours = c.get(Calendar.HOUR_OF_DAY);//Сʱ
        int second = c.get(Calendar.SECOND);//��
        
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hours);
        System.out.println(minute);
        System.out.println(second);
        
        //���һ���������ڸ�ʽ  2013��10��10�� 
        String chineseDate = year+"��"+(++month)+"��"+day;
        System.out.println(chineseDate);
        
	}

}

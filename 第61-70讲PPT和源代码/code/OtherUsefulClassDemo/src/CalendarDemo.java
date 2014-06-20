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
        int year = c.get(Calendar.YEAR);//年份
        int month = c.get(Calendar.MONTH);//月份
        int day = c.get(Calendar.DAY_OF_MONTH);//日
        int minute = c.get(Calendar.MINUTE);//分钟
        int hours = c.get(Calendar.HOUR_OF_DAY);//小时
        int second = c.get(Calendar.SECOND);//秒
        
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hours);
        System.out.println(minute);
        System.out.println(second);
        
        //获得一个中文日期格式  2013年10月10日 
        String chineseDate = year+"年"+(++month)+"月"+day;
        System.out.println(chineseDate);
        
	}

}

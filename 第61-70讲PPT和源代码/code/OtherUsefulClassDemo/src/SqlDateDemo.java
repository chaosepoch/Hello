import java.sql.Date;


public class SqlDateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        //������һ��java.util.Date����
        java.util.Date util_date = new java.util.Date();
        System.out.println(util_date);
        
        //ͨ��java.util.Date����,����һ��sql.Date����
        Date sql_date = new Date(util_date.getTime());
        
        System.out.println(sql_date);
        
	}

}

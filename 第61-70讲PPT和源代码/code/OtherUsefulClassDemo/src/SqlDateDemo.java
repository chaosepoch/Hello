import java.sql.Date;


public class SqlDateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        //先生成一个java.util.Date对象
        java.util.Date util_date = new java.util.Date();
        System.out.println(util_date);
        
        //通过java.util.Date对象,构造一个sql.Date对象。
        Date sql_date = new Date(util_date.getTime());
        
        System.out.println(sql_date);
        
	}

}

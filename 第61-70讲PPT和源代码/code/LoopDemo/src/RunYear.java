
public class RunYear {

	public static void main(String[] args) {
		
		//��ӡ����1900����2050���ڼ����е����ꡣ
        int year=1900;
        
        while(year<=2050)
        {
        	if((year%4==0&&year%100!=0)||(year%400==0))
        	{
        		System.out.print(year+" ");
        	}
        	year++;
        }
	}

}


public class HuiWen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int gw;//个位；
        int sw;//十位
        int bw;//百位
        int qw;//千位
		
		for(int i=1000;i<=9999;i++)
		{
			gw = i%10;
			sw = (i/10)%10;
			bw = (i/100)%10;
			qw = (i/1000)%10;
			
			if((gw==qw)&&(sw==bw))
			{
				System.out.println(i);
			}
		}
	}

}


public class JieCheng {
   
	public static long jieCheng(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*jieCheng(n-1); //这里有递归调用
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        
        System.out.println("5!="+jieCheng(n));
	}

}

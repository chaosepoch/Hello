
public class BuyCooker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int gj;//公鸡的数量
        int mj;//母鸡的数量
        int xj;//小鸡的数量
        
        for(gj=0;gj<=20;gj++)
        {
        	for(mj=0;mj<=33;mj++)
        	{
        		for(xj=0;xj<=100;xj++)
        		{
        			//首先小鸡的数量必须是三的倍数
        			if(xj%3==0)
        			{
        				if((xj+mj+gj==100)&&(xj/3+mj*3+gj*5==100))
        				{
        					System.out.println("公鸡："+gj+"只，母鸡："+mj+"只，小鸡："+xj+"只。");
        				}
        				
        			}
        			
        		}
        	}
        	
        }
		
	}

}

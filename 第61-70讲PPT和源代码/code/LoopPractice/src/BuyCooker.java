
public class BuyCooker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int gj;//����������
        int mj;//ĸ��������
        int xj;//С��������
        
        for(gj=0;gj<=20;gj++)
        {
        	for(mj=0;mj<=33;mj++)
        	{
        		for(xj=0;xj<=100;xj++)
        		{
        			//����С�����������������ı���
        			if(xj%3==0)
        			{
        				if((xj+mj+gj==100)&&(xj/3+mj*3+gj*5==100))
        				{
        					System.out.println("������"+gj+"ֻ��ĸ����"+mj+"ֻ��С����"+xj+"ֻ��");
        				}
        				
        			}
        			
        		}
        	}
        	
        }
		
	}

}

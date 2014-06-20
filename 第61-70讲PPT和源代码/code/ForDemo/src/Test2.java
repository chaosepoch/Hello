
public class Test2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=40;i++)
		{
			
			if(i==10)
			{
				//System.out.println("肚子很痛，不能跑了...");
				//break;//退出整个循环。
			    System.out.println("去接个电话....");
			    continue; //结束本次循环，开始一次新的循环。
			}
			System.out.println("跑完第"+i+"圈了。");
		}
		System.out.println("今天训练到此结束。");
	}

}

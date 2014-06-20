import java.util.Scanner;


public class TreeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int height;//树的高度
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入圣诞树的高度：");
		height = in.nextInt();
		
		for(int i=1;i<=height;i++)
		{
			//首先输出每行前面的空格
			for(int j=1;j<=height-i;j++)
			{
				System.out.print(" ");
			}
			
			//输出每行的星星
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

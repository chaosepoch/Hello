
public class Test1 {
    
	public static void swap(int x,int y) //这里定义了一个swap（）函数,所以这里的x和y就是形参。
	{
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("swap()方法里：x="+x+",y="+y);
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 7;
		System.out.println("交换之前：x="+x+",y="+y);
		swap(x,y);//这里调用了swap()函数。所以说，这里的x和y就是实参。
		System.out.println("交换之后：x="+x+",y="+y);
	}

}

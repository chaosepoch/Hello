
public class Test1 {
    
	public static void swap(int x,int y) //���ﶨ����һ��swap��������,���������x��y�����βΡ�
	{
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("swap()�����x="+x+",y="+y);
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 7;
		System.out.println("����֮ǰ��x="+x+",y="+y);
		swap(x,y);//���������swap()����������˵�������x��y����ʵ�Ρ�
		System.out.println("����֮��x="+x+",y="+y);
	}

}

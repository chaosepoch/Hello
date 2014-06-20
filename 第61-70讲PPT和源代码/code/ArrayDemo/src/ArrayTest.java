
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//动态初始化
		int[] arr = new int[10]; //创建了一个长度为10的整型数组
		arr[0] = 100;
		arr[1] = 23;
		arr[2] = -7;
		arr[3] = 56;
		
		//arr[4] = "hello"; //错误，因为数据类型不一致。
		arr[4] = 'A'; //正确，因为char和int可以相互转化。
		System.out.println("arr数组的长度："+arr.length);
		//arr[10] = 99999;
		//System.out.println("arr[10]="+arr[10]); //错误，不能访问第11个元素。
	    System.out.println("arr[5]="+arr[5]);
	}

}

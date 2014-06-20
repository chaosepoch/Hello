
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num = 100; //不是对象。
         Integer i = 100; //是对象
         
         //num.  点不出属性和方法
         i = num; //自动装箱
         num = i; //自动拆箱
	}

}

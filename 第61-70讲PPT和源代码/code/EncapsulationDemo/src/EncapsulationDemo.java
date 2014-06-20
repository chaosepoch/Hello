
public class EncapsulationDemo {

	public static void main(String[] args) {
       
		int n1 = 101; //不是对象。
		//Integer n2 = new Integer(100); //生成一个整型对象
		Integer n2 = new Integer("100");
		
		//Float f = new Float(3.145);
		Float f = new Float("3.1415");
		//Boolean flag = new Boolean(true);
		Boolean flag = new Boolean("true");
		
		//Integer n2 = new Integer("abc"); //抛出异常
		System.out.println(n2);
		System.out.println(f);
		
		n2 = n1;//装箱
		System.out.println(n2);
		
		boolean b = flag; //拆箱
		System.out.println(b);
	}

}

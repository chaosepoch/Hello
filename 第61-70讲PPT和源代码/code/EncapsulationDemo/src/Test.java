
public class Test {

	public static void main(String[] args) {
	    //从基本数据类型转换为String类型
	    int num = 100;
		float f = 3.1415f;
		double d = 23.456;
		long l = 12345678;
		boolean flag = false;
		
		Integer n = new Integer("12345");
		
		//String s =(String)num;  //错误
		String s = String.valueOf(num);
		System.out.println(s);
		s=String.valueOf(f);
		System.out.println(s);
		s=String.valueOf(d);
		System.out.println(s);
		s=String.valueOf(l);
		System.out.println(s);
		s=String.valueOf(flag);
		System.out.println(s);
	    s = String.valueOf(n);//自动拆箱
	    System.out.println(s);
	    
	    //String转换为基本数据类型
	    String s2 = "false";
	    //int i = (int)s2;  //错误
	    //int i = new Integer(s2);
	    int i = Integer.parseInt(s2); //常用
	    System.out.println(i);
	    double d2 = Double.parseDouble(s2);
	    boolean flag2 = Boolean.parseBoolean(s2);
	    
	}

}

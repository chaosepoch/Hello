
public class Test {

	public static void main(String[] args) {
	    //�ӻ�����������ת��ΪString����
	    int num = 100;
		float f = 3.1415f;
		double d = 23.456;
		long l = 12345678;
		boolean flag = false;
		
		Integer n = new Integer("12345");
		
		//String s =(String)num;  //����
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
	    s = String.valueOf(n);//�Զ�����
	    System.out.println(s);
	    
	    //Stringת��Ϊ������������
	    String s2 = "false";
	    //int i = (int)s2;  //����
	    //int i = new Integer(s2);
	    int i = Integer.parseInt(s2); //����
	    System.out.println(i);
	    double d2 = Double.parseDouble(s2);
	    boolean flag2 = Boolean.parseBoolean(s2);
	    
	}

}

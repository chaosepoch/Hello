
public class EncapsulationDemo {

	public static void main(String[] args) {
       
		int n1 = 101; //���Ƕ���
		//Integer n2 = new Integer(100); //����һ�����Ͷ���
		Integer n2 = new Integer("100");
		
		//Float f = new Float(3.145);
		Float f = new Float("3.1415");
		//Boolean flag = new Boolean(true);
		Boolean flag = new Boolean("true");
		
		//Integer n2 = new Integer("abc"); //�׳��쳣
		System.out.println(n2);
		System.out.println(f);
		
		n2 = n1;//װ��
		System.out.println(n2);
		
		boolean b = flag; //����
		System.out.println(b);
	}

}

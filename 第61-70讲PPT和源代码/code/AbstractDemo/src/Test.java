import java.text.DecimalFormat;


public class Test {

	public static void main(String[] args) {
      
		//MyClass m = new MyClass();
		/*
		MySecondClass m = new MySecondClass();*/
		
		//Shape s = new Trigle(3,4,5);
		Shape s = new Circle(10);
		System.out.println("�ܳ��ǣ�"+new DecimalFormat("#0.00").format(s.getCircle()));
		System.out.println("����ǣ�"+s.getArea());
	    
	}

}

//Բ��
public class Circle extends Shape {

	int r;//�뾶
	final double PI=3.14; //Բ����
	
	Circle(int r)
	{
		this.r = r;
	}
	
	@Override
	public double getCircle() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}

}

//Ô²ĞÎ
public class Circle extends Shape {

	int r;//°ë¾¶
	final double PI=3.14; //Ô²ÖÜÂÊ
	
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

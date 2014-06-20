//三角形
public class Trigle extends Shape {
   
	int a,b,c; //三角形的三条边
	
	double p=0.0;
	//p=(a+b+c)/2  p*(p-a)*(p-b)*(p-c)的平方根-----海伦公式
	
	Trigle(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.p = (a+b+c)/2.0; //注意：分母必须是2.0，否则精度会丢失。
	}
	
	@Override
	public double getCircle() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}

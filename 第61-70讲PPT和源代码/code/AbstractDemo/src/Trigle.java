//������
public class Trigle extends Shape {
   
	int a,b,c; //�����ε�������
	
	double p=0.0;
	//p=(a+b+c)/2  p*(p-a)*(p-b)*(p-c)��ƽ����-----���׹�ʽ
	
	Trigle(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.p = (a+b+c)/2.0; //ע�⣺��ĸ������2.0�����򾫶Ȼᶪʧ��
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


public class Test {

	public static void fn() throws MyException
	{
		throw new MyException(); //�׳�һ���쳣����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		   Test.fn();
		}
		catch(MyException ex)
		{
			System.out.println(ex);
		}
	}

}

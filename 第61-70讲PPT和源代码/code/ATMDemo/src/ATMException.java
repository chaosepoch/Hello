//ATM �쳣��
public class ATMException extends Exception {

	String msg;//�쳣��Ϣ
	
	ATMException(String msg)
	{
		this.msg = msg;
	}
	
	public String toString()
	{
		return this.msg;
	}
}

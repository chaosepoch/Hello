import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//�ͻ���
public class EchoThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 //�����ͷ�������һ������
             Socket client = new Socket("localhost",9999);
			 BufferedReader buff=null ;//����ӷ������˶�ȡ��д���ַ���
			 BufferedReader input=null; //�����ȡ�ӿ���̨������ַ���
			 PrintStream output = null;//��������Ļ�����д���ַ�����
			 buff = new BufferedReader(new InputStreamReader(client.getInputStream()));
			 input = new BufferedReader(new InputStreamReader(System.in));
			 output = new PrintStream(client.getOutputStream());
			 
			 boolean flag = true;
			 while(flag)
			 {
				 System.out.println("��������Ϣ��");
				 String msg = input.readLine();
				 if(msg==null||msg.equalsIgnoreCase("bye"))
				 {
					 flag = false;
				 }
				 else
				 {
					output.println(msg); //�����������
					//��÷�������д���ַ���
					String echo = buff.readLine();
					System.out.println(echo);
				 }
			 }
			 buff.close();
			 client.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

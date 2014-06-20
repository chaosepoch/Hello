import java.io.File;
import java.io.IOException;


public class FileDemo2 {

	
	public static void main(String[] args) {
		
		//����c:\\haha\\hehe\\test.txt �ļ�
		//1.���ȴ���c:\\hahaĿ¼
		//2.����test.txt�ļ�
		
		//������Ŀ¼
		File parent = new File("c:"+File.separator+"haha"+File.separator+"hehe");
		
		File child = new File(parent,"test.txt");
		
		try
		{
			if(!parent.exists()) //���ȼ�鸸Ŀ¼�Ƿ��Ѿ�����
			{
				 //parent.mkdir();//һ��ֻ�ܴ���һ��Ŀ¼
				 parent.mkdirs();//һ�ο��Դ������Ŀ¼
				 child.createNewFile();//�������ļ�;
				 System.out.println("�ļ������ɹ���");
			}
			else
			{
				child.createNewFile();
				System.out.println("�ļ������ɹ���");
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		for(int i=0;i<10;i++) //����10����
		{
			try
			{
			   Thread.sleep(1000);//�߳�����1����;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("�ļ��ľ���·����"+child.getAbsolutePath());
		System.out.println("�ļ�����"+child.getName());
		System.out.println("�ļ���Ŀ¼��·����"+child.getParent());
		
		System.out.println("�Ƿ���Ŀ¼��"+child.isDirectory());
		System.out.println("�Ƿ����ļ���"+child.isFile());
		System.out.println("�ļ����ȣ�"+child.length()+"�ֽ�");
		
		
		//ɾ���ļ�
		child.delete();
	}

}

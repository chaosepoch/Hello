
public class RuntimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runtime rt = Runtime.getRuntime(); //�������ʱ����
        /*
        Process p;  
        try
        {
           p = rt.exec("notepad.exe");
           Thread.sleep(10000);//����ʮ����;	
           p.destroy(); //ʮ���Ӻ��Զ����ٽ���
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }*/
        
        System.out.println("Free Memory:"+rt.freeMemory());//JVM�����ڴ�
        System.out.println("Max Memory:"+rt.maxMemory());//���õ�����ڴ�
        System.out.println("Total Memory:"+rt.totalMemory());//JVM�����ڴ�
        
        
	}

}

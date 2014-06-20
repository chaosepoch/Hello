
public class RuntimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runtime rt = Runtime.getRuntime(); //获得运行时对象
        /*
        Process p;  
        try
        {
           p = rt.exec("notepad.exe");
           Thread.sleep(10000);//休眠十秒钟;	
           p.destroy(); //十秒钟后自动销毁进程
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }*/
        
        System.out.println("Free Memory:"+rt.freeMemory());//JVM空闲内存
        System.out.println("Max Memory:"+rt.maxMemory());//可用的最大内存
        System.out.println("Total Memory:"+rt.totalMemory());//JVM所有内存
        
        
	}

}


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Brake brake = new Brake();//面包对象
		//厨房对象
		Kitchen kitchen = new Kitchen(brake);
		//生产者对象
		Productor p = new Productor(kitchen);
		
		//两个消费者对象
		Consumer c1 = new Consumer(kitchen);
		Consumer c2 = new Consumer(kitchen);
		
		//妈妈线程
		Thread mother = new Thread(p,"妈妈");
		//大林线程
		Thread bigSon = new Thread(c1,"大林");
		//小林线程
		Thread smallSon =new Thread(c2,"小林");
		
		mother.start();//启动妈妈做面包的线程
		bigSon.start();//启动大林吃面包的线程
		smallSon.start();//启动小林吃面包的线程
		
		try
		{
			mother.join();
			bigSon.join();
			smallSon.join();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		//统计结果
		System.out.println("大林吃了："+Kitchen.bigNum);
		System.out.println("小林吃了："+Kitchen.smallNum);
		
	}

}

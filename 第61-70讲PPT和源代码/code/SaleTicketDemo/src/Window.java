import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

//窗口类
public class Window {

	private String name;//窗口的名字
	
	public static final int MAX_LEN=10;
	//当前队列元素长度的属性,由于要进行自增运算，保证原子性，所以选用原子类型。
	private AtomicInteger len = new AtomicInteger(0);
	
	//选取一个支持同步的集合类型，来充当有限缓冲区。
	Vector<Integer> queue = new Vector<Integer>();

	public Window(String name)
	{
		this.name = name;
	}
	
    public int getLength()
    {
    	return this.len.get();
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    //入队的方法
    public synchronized void insert(int number)
    {
    	queue.add(number);
    	this.len.getAndIncrement();//队列长度加1；
    }
    
    //出队的方法
    public synchronized int remove()
    {
    	this.len.getAndDecrement(); //队列长度减1
    	return queue.remove(0);//获取队头元素
    }
}

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

//������
public class Window {

	private String name;//���ڵ�����
	
	public static final int MAX_LEN=10;
	//��ǰ����Ԫ�س��ȵ�����,����Ҫ�����������㣬��֤ԭ���ԣ�����ѡ��ԭ�����͡�
	private AtomicInteger len = new AtomicInteger(0);
	
	//ѡȡһ��֧��ͬ���ļ������ͣ����䵱���޻�������
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
    
    //��ӵķ���
    public synchronized void insert(int number)
    {
    	queue.add(number);
    	this.len.getAndIncrement();//���г��ȼ�1��
    }
    
    //���ӵķ���
    public synchronized int remove()
    {
    	this.len.getAndDecrement(); //���г��ȼ�1
    	return queue.remove(0);//��ȡ��ͷԪ��
    }
}

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//������
public class MyDinnerProxy implements InvocationHandler {

	private Object originalObject; //�������ԭʼ����
	
	//�󶨱�������󣬷���һ���������
	public Object bind(Object obj)
	{
		this.originalObject = obj;
		//����һ���������
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	//�Է�֮ǰҪִ�еķ���
	private void preMethod()
	{
		System.out.println("�Է�֮ǰϴ�ֱ��ָ�������...");
	}
	
	//�Է�֮��ķ���
	private void afterMethod()
	{
		System.out.println("�Է�֮��ϴ�뱣�ֳ�������....");
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		preMethod();
		result = method.invoke(this.originalObject, args);
		afterMethod();
		return result;
	}

	
}

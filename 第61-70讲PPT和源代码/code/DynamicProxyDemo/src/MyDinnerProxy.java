import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类
public class MyDinnerProxy implements InvocationHandler {

	private Object originalObject; //被代理的原始对象
	
	//绑定被代理对象，返回一个代理对象
	public Object bind(Object obj)
	{
		this.originalObject = obj;
		//返回一个代理对象
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	//吃饭之前要执行的方法
	private void preMethod()
	{
		System.out.println("吃饭之前洗手保持个人卫生...");
	}
	
	//吃饭之后的方法
	private void afterMethod()
	{
		System.out.println("吃饭之后洗碗保持厨房卫生....");
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

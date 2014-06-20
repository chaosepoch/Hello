//测试类
public class MyDinnerProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinner din = new MyDinner();
		//不是使用代理对象的效果
		//din.haveDinner();
		MyDinnerProxy proxy = new MyDinnerProxy();
		//返回了一个代理对象
		din = (Dinner)proxy.bind(din);
		//执行代理对象的方法
		din.haveDinner();
	}

}

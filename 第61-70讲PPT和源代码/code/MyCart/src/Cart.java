import java.util.HashMap;
import java.util.Set;

//购物车
public class Cart {
    //购物车
	private HashMap<Books,Integer> carts = new HashMap<Books,Integer>();

	//添加购物车
	public void addToCart(Books b,int number)
	{
		carts.put(b, number);
	}
	//购物车的删除
	public void removeFromCart(Books b)
	{
		carts.remove(b);
	}
	
	//显示购物车内容
	public void showCart()
	{
		Set<Books> keys = carts.keySet();
		for(Books b:keys)
		{
			System.out.println(b+" = "+carts.get(b));
		}
	}
	
	public static void main(String[] args)
	{
		Books b1 = new Books("红楼梦","曹雪芹");
		Books b2 = new Books("西游记","吴承恩");
		Books b3 = new Books("三国","罗贯中");
		Books b4 = new Books("水浒","施耐庵");
		Books b5 = new Books("红楼梦","曹雪芹");
		
		Cart cart = new Cart();
		cart.addToCart(b1, 10);
		cart.addToCart(b2, 20);
		cart.addToCart(b3, 30);
		cart.addToCart(b4, 40);
		
		System.out.println("-------------------");
		cart.showCart();
		System.out.println("---------再次购买红楼梦----------");
		cart.addToCart(b5, 50);
		
		cart.showCart();
		System.out.println("---------从购物车中删除红楼梦----------");
		cart.removeFromCart(b1);//cart.removeFromCart(b5) 也可以删除，因为Books类已经重写了hashCode和equals方法。
		cart.showCart();
		
	}
}

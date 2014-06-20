import java.util.HashMap;
import java.util.Set;

//���ﳵ
public class Cart {
    //���ﳵ
	private HashMap<Books,Integer> carts = new HashMap<Books,Integer>();

	//��ӹ��ﳵ
	public void addToCart(Books b,int number)
	{
		carts.put(b, number);
	}
	//���ﳵ��ɾ��
	public void removeFromCart(Books b)
	{
		carts.remove(b);
	}
	
	//��ʾ���ﳵ����
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
		Books b1 = new Books("��¥��","��ѩ��");
		Books b2 = new Books("���μ�","��ж�");
		Books b3 = new Books("����","�޹���");
		Books b4 = new Books("ˮ�","ʩ����");
		Books b5 = new Books("��¥��","��ѩ��");
		
		Cart cart = new Cart();
		cart.addToCart(b1, 10);
		cart.addToCart(b2, 20);
		cart.addToCart(b3, 30);
		cart.addToCart(b4, 40);
		
		System.out.println("-------------------");
		cart.showCart();
		System.out.println("---------�ٴι����¥��----------");
		cart.addToCart(b5, 50);
		
		cart.showCart();
		System.out.println("---------�ӹ��ﳵ��ɾ����¥��----------");
		cart.removeFromCart(b1);//cart.removeFromCart(b5) Ҳ����ɾ������ΪBooks���Ѿ���д��hashCode��equals������
		cart.showCart();
		
	}
}

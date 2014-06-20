import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Books> list = new ArrayList<Books>();
	    //ArrayList list = new ArrayList();
		//list.add("hello");
		//list.add(true);
		//list.add(3.14);
		list.add(new Books("红楼梦","人民文学出版社",150));
		list.add(new Books("三国","人民文学出版社",120));
		list.add(new Books("水浒","人民文学出版社",180));
		list.add(new Books("西游记","人民文学出版社",110));
		
		/*
		for(int i=0;i<list.size();i++)
		{
			Books b = (Books)list.get(i);//如果不使用泛型，必须进行强制类型转换。
			System.out.println(b.showInfo());
		}*/
		
		//使用foreach循环遍历集合。
		for(Books b:list)
		{
			System.out.println(b.showInfo());
		}
		
		int[] arr = {0,1,2,3,4,5};
		for(int i:arr)
		{
			i++;
			System.out.println(i);
		}
  		System.out.println("------------------");
  		//foreach循环是只读的。
  		for(int i:arr)
		{
			//i++;
			System.out.println(i);
		}
	}

}

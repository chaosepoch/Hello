import java.util.Scanner;


public class Test {

	private static Car c=new Car();
    private static Scanner in = new Scanner(System.in);
    
	//给车选颜色
	public static void choiceCarColor()
	{
		int choice;
		MyColor car_color;
		MyColor[] colors = MyColor.values();
		
		System.out.println("请选择您喜欢的颜色:");
		int iCount=0;
		for(MyColor c :colors)
		{
			System.out.println((iCount++)+":"+c.getName());
		}
		System.out.println("请选择：");
		
		choice = in.nextInt();
		car_color = colors[choice];
		
		switch(car_color)
		{
		    case RED:
		    	System.out.println("红色表示热情似火..");
		    	break;
		    case GREEN:
		    	System.out.println("绿色表示青春活力...");
		    	break;
		    case BLUE:
		    	System.out.println("蓝色表示浪漫...");
		    	break;
		    case WHITE:
		    	System.out.println("白色表示纯洁...");
		    	break;
		    case BLACK:
		    	System.out.println("黑色表示高贵...");
		    	break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //MyColor c = new MyColor(); //不能使用构造方法来实例化
		/*
		MyColor c = MyColor.GREEN; 
		
		System.out.println(c.ordinal()); //打印枚举常量的编号
	    
		System.out.println(c.name());
		
		System.out.println(c.toString());
		
		System.out.println(c.getName()); //绿色
		
		System.out.println(Enum.valueOf(MyColor.class,"RED"));
	    */
	    //System.out.println(c);
	    
		Test.choiceCarColor();
		
	}

}

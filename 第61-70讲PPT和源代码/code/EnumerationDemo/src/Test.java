import java.util.Scanner;


public class Test {

	private static Car c=new Car();
    private static Scanner in = new Scanner(System.in);
    
	//����ѡ��ɫ
	public static void choiceCarColor()
	{
		int choice;
		MyColor car_color;
		MyColor[] colors = MyColor.values();
		
		System.out.println("��ѡ����ϲ������ɫ:");
		int iCount=0;
		for(MyColor c :colors)
		{
			System.out.println((iCount++)+":"+c.getName());
		}
		System.out.println("��ѡ��");
		
		choice = in.nextInt();
		car_color = colors[choice];
		
		switch(car_color)
		{
		    case RED:
		    	System.out.println("��ɫ��ʾ�����ƻ�..");
		    	break;
		    case GREEN:
		    	System.out.println("��ɫ��ʾ�ഺ����...");
		    	break;
		    case BLUE:
		    	System.out.println("��ɫ��ʾ����...");
		    	break;
		    case WHITE:
		    	System.out.println("��ɫ��ʾ����...");
		    	break;
		    case BLACK:
		    	System.out.println("��ɫ��ʾ�߹�...");
		    	break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //MyColor c = new MyColor(); //����ʹ�ù��췽����ʵ����
		/*
		MyColor c = MyColor.GREEN; 
		
		System.out.println(c.ordinal()); //��ӡö�ٳ����ı��
	    
		System.out.println(c.name());
		
		System.out.println(c.toString());
		
		System.out.println(c.getName()); //��ɫ
		
		System.out.println(Enum.valueOf(MyColor.class,"RED"));
	    */
	    //System.out.println(c);
	    
		Test.choiceCarColor();
		
	}

}

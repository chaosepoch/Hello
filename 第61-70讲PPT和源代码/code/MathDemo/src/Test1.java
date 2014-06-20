
public class Test1 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 3;
		
		//System.out.println(x%y);
		/*
		System.out.println(x++); //10
		System.out.println(++x); //12
		System.out.println(--x); //11
		System.out.println(x--); //11
		System.out.println(x); //10*/
		
		if(++x >10 || y-- <3)
		{
			System.out.println("x="+x+",y="+y);
		}
		
		
	}

}

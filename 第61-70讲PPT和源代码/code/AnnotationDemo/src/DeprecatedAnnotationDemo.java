@Deprecated
class Test
{
   //@Deprecated	
   public void change()
   {
	   System.out.println("Test���chang()������ִ��....");
   }
}

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.change();
	}
}

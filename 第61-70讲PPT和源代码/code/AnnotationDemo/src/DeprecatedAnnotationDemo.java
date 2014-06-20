@Deprecated
class Test
{
   //@Deprecated	
   public void change()
   {
	   System.out.println("Test类的chang()方法被执行....");
   }
}

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.change();
	}
}

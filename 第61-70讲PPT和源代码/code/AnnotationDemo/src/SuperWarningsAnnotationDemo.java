
class Foo<T>
{
   private T var;
   public void setVar(T var)
   {
	   this.var = var;
   }
   
   public T getVar()
   {
	   return this.var;
   }
  
   public void showVar()
   {
	   System.out.println(this.getVar());
   }
}

public class SuperWarningsAnnotationDemo {
    
	//@SuppressWarnings("unchecked")
	@SuppressWarnings({"unchecked","deprecation"})
	public static void main(String[] args) {
		
		//Foo<String> f = new Foo<String>();
		Foo f = new Foo();
		f.setVar("china");
		f.showVar();
		
		Test t = new Test();
		t.change();
		
	}
}

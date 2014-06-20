import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

	
	public static void main(String[] args) {
	   
		TreeSet set = new TreeSet();
		
		set.add("china");
		set.add("windows");
		set.add("admin");
		set.add("canon");
		set.add("picture");
		set.add("monkey");
		set.add("Windows");
		
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}

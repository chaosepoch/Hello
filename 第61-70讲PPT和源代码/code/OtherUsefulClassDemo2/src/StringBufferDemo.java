
public class StringBufferDemo {

	
	public static void main(String[] args) {
	  
		String s = "I love you";
		System.out.println(s);
		System.out.println(s.hashCode());
		s +=" china"; // "I love you china" ;
		System.out.println(s);
		System.out.println(s.hashCode());
		
		System.out.println("-------------------------");
		StringBuffer sb = new StringBuffer("I love you");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" china");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.reverse());//×Ö·û´®·­×ª
		
		
	}

}

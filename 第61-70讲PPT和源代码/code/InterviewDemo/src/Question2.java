
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "hello";
        //String s2 = new String("hello");
        String s2 = "hello";
        String s3 = new String("hello");
        
        System.out.println(s1==s2);//false //true
        System.out.println(s2==s3);//false
        
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s3));//true
	}

}

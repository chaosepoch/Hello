import java.util.StringTokenizer;


public class StringDemo {

	public static void main(String[] args) {
		
		//��̬��ʼ���ַ���
		String s1 = "hello china!";
		String s3 = "Hello China!";
		System.out.println(s1);
		//��̬��ʼ���ַ���
	    String s2 = new String("hello china!,china,china");
	    String s4 = new String("hello china!");
	    String s5 = "hello Japan";
	    String s6 = "Hey,"; //Hey,hello china!
	    String s7 = "����|�Ϻ�|�Ͼ�|�人|�ɶ�";
	    
	    System.out.println(s1==s3);//true
	    System.out.println(s2==s4);//false
	    System.out.println(s2.equals(s4));//true
	    
	    System.out.println(s1.charAt(6));//����ַ�'c'
	    //����0��s1==s5, ����  s1<s5  ���� s1>s5
	    System.out.println(s1.compareTo(s5));
	    System.out.println(s6.concat(s1));
	    System.out.println(s6+s1);
	    
	    System.out.println(s1.contains("china"));//true
	    System.out.println(s1.contains("japan"));//false
	    
	    byte[] arr = s1.getBytes();
	    System.out.println(s2.indexOf("china"));
	    System.out.println(s2.lastIndexOf("china"));
	    
	    String[] citys = s7.split("\\|");
	    for(int i=0;i<citys.length;i++)
	    {
	    	System.out.println(citys[i]);
	    }
	    StringTokenizer st = new StringTokenizer(s7,"|");
	    System.out.println("-------------------");
	    while(st.hasMoreElements())
	    {
	    	System.out.println(st.nextElement());
	    }
	    System.out.println(s1.substring(6,s1.length()-1));
	    System.out.println(s1.toUpperCase());
	    System.out.println(s3.toLowerCase());
	}

}

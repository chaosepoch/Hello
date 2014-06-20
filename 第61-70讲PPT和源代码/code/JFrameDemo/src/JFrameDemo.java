import javax.swing.JFrame;
import javax.swing.WindowConstants;


//编写用户自定义的窗口类必须继承JFrame类
class MyFrame extends JFrame
{
   public MyFrame(String title)
   {
	   this.setTitle(title); //设置窗口的标题
	   //设置窗口默认的关闭行为
	   this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }
}

public class JFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("我的第一个JAVA图形窗口");
        frame.setSize(600, 500);
        frame.setLocation(0, 0);
        frame.setVisible(true);//设置窗口可见
	}

}

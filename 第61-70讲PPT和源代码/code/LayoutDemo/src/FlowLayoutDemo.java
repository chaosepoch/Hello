import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//流布局管理器
public class FlowLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MyFrame frame = new MyFrame("我的windows窗体");
		
		JPanel pan = new JPanel();
		JButton btn1 = new JButton("按钮1");
		JButton btn2 = new JButton("按钮2");
		JButton btn3 = new JButton("按钮3");
		
		//指定面板使用流布局管理器;
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);//指定为左对齐
		pan.setLayout(layout);
		
		//将按钮放在面板上
		pan.add(btn1);//默认使用的是流布局管理器
		pan.add(btn2);
		pan.add(btn3);
		
		//把面板放在窗口里
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		
	}

}

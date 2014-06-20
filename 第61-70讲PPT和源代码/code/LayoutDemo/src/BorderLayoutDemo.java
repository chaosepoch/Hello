import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//边界布局管理器
public class BorderLayoutDemo {

	public static void main(String[] args) {
		
        MyFrame frame = new MyFrame("我的windows窗体");
		
		JPanel pan = new JPanel();
		JButton btn1 = new JButton("北按钮");
		JButton btn2 = new JButton("南按钮");
		JButton btn3 = new JButton("西按钮");
		JButton btn4 = new JButton("东按钮");
		JButton btn5 = new JButton("中按钮");
		
		//指定面板使用边界布局管理器;
		BorderLayout layout = new BorderLayout();
		//layout.setAlignment(FlowLayout.LEFT);//指定为左对齐
		pan.setLayout(layout);
		
		//将按钮放在面板上
		pan.add(btn1,BorderLayout.NORTH);//指定放置的位置
		pan.add(btn2,BorderLayout.SOUTH);
		pan.add(btn3,BorderLayout.EAST);
		pan.add(btn4,BorderLayout.WEST);
		pan.add(btn5,BorderLayout.CENTER);
		//把面板放在窗口里
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		
	}
}

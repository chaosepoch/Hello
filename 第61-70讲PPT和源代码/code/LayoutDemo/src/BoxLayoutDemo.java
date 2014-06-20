import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//盒子布局管理器
public class BoxLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("我的windows窗体");
		
		JPanel pan_x = new JPanel();
		JPanel pan_y = new JPanel();
		
		
		JButton btn1 = new JButton("按钮1");
		JButton btn2 = new JButton("按钮2");
		JButton btn3 = new JButton("按钮3");
		JButton btn4 = new JButton("按钮4");
		JButton btn5 = new JButton("按钮5");
		JButton btn6 = new JButton("按钮6");
		
		//指定面板使用盒子布局管理器;
		BoxLayout layout_x = new BoxLayout(pan_x,BoxLayout.X_AXIS);
		
		BoxLayout layout_y = new BoxLayout(pan_y,BoxLayout.Y_AXIS);
		
		pan_x.setLayout(layout_x);
		pan_y.setLayout(layout_y);
		
		//将按钮放在面板上
		pan_x.add(btn1);
		pan_x.add(btn2);
		pan_x.add(btn3);
		
		pan_y.add(btn4);
		pan_y.add(btn5);
		pan_y.add(btn6);
		
		//把面板放在窗口里
		
		frame.add(pan_x,BorderLayout.PAGE_START);//等同于BorderLayout.North;
		frame.add(pan_y,BorderLayout.PAGE_END);//等同于BorderLayout.South;
		
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

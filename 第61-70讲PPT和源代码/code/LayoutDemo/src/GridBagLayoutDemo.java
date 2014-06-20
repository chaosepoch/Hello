import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//网格袋子布局管理器
public class GridBagLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("我的windows窗体");
		
		JPanel pan = new JPanel();
		
		JButton btn1 = new JButton("按钮1");
		JButton btn2 = new JButton("按钮2");
		JButton btn3 = new JButton("按钮3");
		JButton btn4 = new JButton("按钮4");
		
		//指定面板使用流布局管理器;
		GridBagLayout layout = new GridBagLayout();
		//layout.setAlignment(FlowLayout.LEFT);//指定为左对齐
		pan.setLayout(layout);
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		pan.add(btn1,c);
		
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=0;
		pan.add(btn2,c);
		
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=0;
		pan.add(btn3,c);
		
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridwidth=3;
		c.gridx=0;
		c.gridy=1;
		pan.add(btn4,c);
		
		//把面板放在窗口里
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

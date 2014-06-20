import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//网格布局管理器
public class GrideLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("我的windows窗体");
		
		JPanel pan = new JPanel();
		
		//指定面板使用流布局管理器;
		GridLayout layout = new GridLayout(3,3);
		//layout.setAlignment(FlowLayout.LEFT);//指定为左对齐
		pan.setLayout(layout);
		
		//将按钮放在面板上
		JButton[] btns = new JButton[9];
		for(int i=0;i<btns.length;i++)
		{
			btns[i]= new JButton("NO."+(i+1)+"");
	       	btns[i].setFont(new Font("黑体",Font.BOLD,30));
			pan.add(btns[i]);
		}
		
		//把面板放在窗口里
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

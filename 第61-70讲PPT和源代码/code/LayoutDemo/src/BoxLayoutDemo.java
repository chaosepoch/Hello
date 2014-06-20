import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//���Ӳ��ֹ�����
public class BoxLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("�ҵ�windows����");
		
		JPanel pan_x = new JPanel();
		JPanel pan_y = new JPanel();
		
		
		JButton btn1 = new JButton("��ť1");
		JButton btn2 = new JButton("��ť2");
		JButton btn3 = new JButton("��ť3");
		JButton btn4 = new JButton("��ť4");
		JButton btn5 = new JButton("��ť5");
		JButton btn6 = new JButton("��ť6");
		
		//ָ�����ʹ�ú��Ӳ��ֹ�����;
		BoxLayout layout_x = new BoxLayout(pan_x,BoxLayout.X_AXIS);
		
		BoxLayout layout_y = new BoxLayout(pan_y,BoxLayout.Y_AXIS);
		
		pan_x.setLayout(layout_x);
		pan_y.setLayout(layout_y);
		
		//����ť���������
		pan_x.add(btn1);
		pan_x.add(btn2);
		pan_x.add(btn3);
		
		pan_y.add(btn4);
		pan_y.add(btn5);
		pan_y.add(btn6);
		
		//�������ڴ�����
		
		frame.add(pan_x,BorderLayout.PAGE_START);//��ͬ��BorderLayout.North;
		frame.add(pan_y,BorderLayout.PAGE_END);//��ͬ��BorderLayout.South;
		
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

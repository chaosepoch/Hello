import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//�߽粼�ֹ�����
public class BorderLayoutDemo {

	public static void main(String[] args) {
		
        MyFrame frame = new MyFrame("�ҵ�windows����");
		
		JPanel pan = new JPanel();
		JButton btn1 = new JButton("����ť");
		JButton btn2 = new JButton("�ϰ�ť");
		JButton btn3 = new JButton("����ť");
		JButton btn4 = new JButton("����ť");
		JButton btn5 = new JButton("�а�ť");
		
		//ָ�����ʹ�ñ߽粼�ֹ�����;
		BorderLayout layout = new BorderLayout();
		//layout.setAlignment(FlowLayout.LEFT);//ָ��Ϊ�����
		pan.setLayout(layout);
		
		//����ť���������
		pan.add(btn1,BorderLayout.NORTH);//ָ�����õ�λ��
		pan.add(btn2,BorderLayout.SOUTH);
		pan.add(btn3,BorderLayout.EAST);
		pan.add(btn4,BorderLayout.WEST);
		pan.add(btn5,BorderLayout.CENTER);
		//�������ڴ�����
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		
	}
}

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//���񲼾ֹ�����
public class GrideLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("�ҵ�windows����");
		
		JPanel pan = new JPanel();
		
		//ָ�����ʹ�������ֹ�����;
		GridLayout layout = new GridLayout(3,3);
		//layout.setAlignment(FlowLayout.LEFT);//ָ��Ϊ�����
		pan.setLayout(layout);
		
		//����ť���������
		JButton[] btns = new JButton[9];
		for(int i=0;i<btns.length;i++)
		{
			btns[i]= new JButton("NO."+(i+1)+"");
	       	btns[i].setFont(new Font("����",Font.BOLD,30));
			pan.add(btns[i]);
		}
		
		//�������ڴ�����
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

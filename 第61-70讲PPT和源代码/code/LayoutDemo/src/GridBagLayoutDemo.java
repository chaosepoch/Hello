import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//������Ӳ��ֹ�����
public class GridBagLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("�ҵ�windows����");
		
		JPanel pan = new JPanel();
		
		JButton btn1 = new JButton("��ť1");
		JButton btn2 = new JButton("��ť2");
		JButton btn3 = new JButton("��ť3");
		JButton btn4 = new JButton("��ť4");
		
		//ָ�����ʹ�������ֹ�����;
		GridBagLayout layout = new GridBagLayout();
		//layout.setAlignment(FlowLayout.LEFT);//ָ��Ϊ�����
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
		
		//�������ڴ�����
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

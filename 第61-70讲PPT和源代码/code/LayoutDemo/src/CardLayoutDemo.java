import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

//��Ƭ���ֹ�����
public class CardLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("�ҵ�windows����");
		
		final JPanel pan_content = new JPanel();
		JPanel pan_control = new JPanel();
        
		JButton btn = new JButton("Next");
		
		JButton[] btns = new JButton[10];
		
		//ָ�����ʹ�ÿ�Ƭ���ֹ�����;
		final CardLayout layout = new CardLayout();
		pan_content.setLayout(layout);
		
		for(int i=0;i<btns.length;i++)
		{
	       	btns[i]= new JButton("NO."+(i+1)+"");
	       	btns[i].setFont(new Font("����",Font.BOLD,30));
			pan_content.add(btns[i]);
		}
		
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.next(pan_content);
			}
			
		});
		pan_control.add(btn);
		
		
		//�������ڴ�����
		frame.add(pan_content,BorderLayout.CENTER);
		frame.add(pan_control,BorderLayout.SOUTH);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

}

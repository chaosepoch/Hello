import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class OuterClass implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "���԰�ť�������", "��ʾ��Ϣ", JOptionPane.DEFAULT_OPTION);				
	}
	
}


//��д�û��Զ���Ĵ��������̳�JFrame��
class MyJFrame extends JFrame implements ActionListener
{
	
   static class InnerClass implements ActionListener
   {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showConfirmDialog(null, "���԰�ť�������", "��ʾ��Ϣ", JOptionPane.DEFAULT_OPTION);				
		}
	   
   }
	
   public MyJFrame(String title) 
   {
	   this.setTitle(title); //���ô��ڵı���
	   //���ô���Ĭ�ϵĹر���Ϊ
	   this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       //����һ��������������һ���������
	   JPanel pan = new JPanel();
	   JButton button = new JButton("���԰�ť");
	   this.add(pan);
	   pan.add(button);
	   //1.ʹ���������ڲ���
	   /*
	   button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
               JOptionPane.showConfirmDialog(null, "���԰�ť�������", "��ʾ��Ϣ", JOptionPane.DEFAULT_OPTION);				
			}
		   
	   });*/
	   
	   //2.ͨ���ڲ���ʵ��
	   /*
	   button.addActionListener(new InnerClass());*/
       //3.ͨ���ⲿ��ʵ��
	   /*button.addActionListener(new OuterClass());*/
	   
	   //4.����ʵ��ActionListener�ӿڣ�ע�ᵱǰ���ڶ���
	   button.addActionListener(this);
	   
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JOptionPane.showConfirmDialog(null, "���԰�ť�������", "��ʾ��Ϣ", JOptionPane.DEFAULT_OPTION);				
	}
}

public class MyListenerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyJFrame frame = new MyJFrame("�ҵĵ�һ��JAVAͼ�δ���");
        frame.setSize(600, 500);
        frame.setLocation(0, 0);
        frame.setVisible(true);//���ô��ڿɼ�
	}

}

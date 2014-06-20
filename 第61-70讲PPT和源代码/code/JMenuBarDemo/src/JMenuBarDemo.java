import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class JMenuBarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int width=600; //����Ŀ��
       int height=400;//�߶�
	   MyFrame frame = new MyFrame("�ҵ�windows����");
       
       frame.setSize(width, height);
       
       //��θ����������Զ����ͼ��
       //�õ�ͼƬ��·��
       URL url = frame.getClass().getResource("/pic/rsso.gif");
       //����ͼƬ����
       Image img = frame.getToolkit().getImage(url);
       //���ô����ͼ��
       frame.setIconImage(img);
       
       //���ȴ����˵���
       JMenuBar bar = new JMenuBar();
       
       //�����ļ��˵�
       JMenu fileMenu = new JMenu("�ļ�");
       fileMenu.setIcon(new ImageIcon("pic/file.gif"));
       
       //�����˵�����
       JMenuItem newItem = new JMenuItem("�½�",new ImageIcon("pic/folder.gif"));
       //���ÿ�ݼ�
       newItem.setMnemonic('N');
       //������ϼ�
       newItem.setAccelerator(KeyStroke.getKeyStroke('N', java.awt.event.KeyEvent.CTRL_MASK));
       
       newItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	             JOptionPane.showConfirmDialog(null, "��������½��˵���", "��ʾ��Ϣ", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION);	
	             
			}
    	   
       });
       
       JMenuItem openItem = new JMenuItem("��");
       JMenuItem saveItem = new JMenuItem("����");
       JMenuItem quitItem = new JMenuItem("�˳�");
       
       quitItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			   int result =	JOptionPane.showConfirmDialog(null, "�����Ҫ�˳�ϵͳ��", "��ʾ��Ϣ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, new ImageIcon("pic/tip.gif"));
			   if(result==JOptionPane.OK_OPTION)
			   {
				   System.exit(0); //�˳�ϵͳ
			   }
			   else
			   {
				   return;
			   }
			}
    	   
       });
       
       fileMenu.add(newItem);
       fileMenu.add(openItem);
       //��ӷָ���
       fileMenu.addSeparator();
       fileMenu.add(saveItem);
       fileMenu.add(quitItem);
       
       
       
       //����ô�����ʾ����Ļ����
       int screen_width = (int)frame.getToolkit().getScreenSize().getWidth(); //�õ���Ļ�Ŀ��
	   int screen_height = (int)frame.getToolkit().getScreenSize().getHeight(); //�õ���Ļ�ĸ߶�
       
	   bar.add(fileMenu);
	   //��������Ӳ˵���
	   frame.setJMenuBar(bar);
	   
	   frame.setLocation((screen_width-width)/2, (screen_height-height)/2);
	   frame.setResizable(false);
	   frame.setVisible(true);
	   
	   
	}

}

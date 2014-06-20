import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MainFrame extends MyFrame{

	int width=600; //����Ŀ��
    int height=400;//�߶�
	public MainFrame(String title)
	{
		super(title);
	    this.setSize(width, height);
       
       //��θ����������Զ����ͼ��
       //�õ�ͼƬ��·��
       URL url = this.getClass().getResource("/pic/rsso.gif");
       //����ͼƬ����
       Image img = this.getToolkit().getImage(url);
       //���ô����ͼ��
       this.setIconImage(img);
       
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
       
       JMenuItem regItem = new JMenuItem("ע��");
       
       regItem.addActionListener(new ActionListener(){
    	   @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	            RegFrame regFrame = new RegFrame("�û�ע��");  
			}
       });
       
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
       fileMenu.add(regItem);
       //��ӷָ���
       fileMenu.addSeparator();
       fileMenu.add(saveItem);
       fileMenu.add(quitItem);
       
       
       
       //����ô�����ʾ����Ļ����
       int screen_width = (int)this.getToolkit().getScreenSize().getWidth(); //�õ���Ļ�Ŀ��
	   int screen_height = (int)this.getToolkit().getScreenSize().getHeight(); //�õ���Ļ�ĸ߶�
       
	   bar.add(fileMenu);
	   //��������Ӳ˵���
	   this.setJMenuBar(bar);
	   
	   this.addWindowListener(this);
	   this.setLocation((screen_width-width)/2, (screen_height-height)/2);
	   this.setResizable(false);
	   this.setVisible(true);

	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		int result =JOptionPane.showConfirmDialog(null, "�����Ҫ�˳�ϵͳ��", "��ʾ��Ϣ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, new ImageIcon("pic/tip.gif"));
		if(result==JOptionPane.OK_OPTION)
		{
		   System.exit(0); //�˳�ϵͳ
		}
		else
		{
		   this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		   return;
		}
	}
	
	

}

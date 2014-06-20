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
       int width=600; //窗体的宽度
       int height=400;//高度
	   MyFrame frame = new MyFrame("我的windows窗体");
       
       frame.setSize(width, height);
       
       //如何给窗体设置自定义的图标
       //得到图片的路径
       URL url = frame.getClass().getResource("/pic/rsso.gif");
       //创建图片对象
       Image img = frame.getToolkit().getImage(url);
       //设置窗体的图标
       frame.setIconImage(img);
       
       //首先创建菜单栏
       JMenuBar bar = new JMenuBar();
       
       //创建文件菜单
       JMenu fileMenu = new JMenu("文件");
       fileMenu.setIcon(new ImageIcon("pic/file.gif"));
       
       //创建菜单子项
       JMenuItem newItem = new JMenuItem("新建",new ImageIcon("pic/folder.gif"));
       //设置快捷键
       newItem.setMnemonic('N');
       //设置组合键
       newItem.setAccelerator(KeyStroke.getKeyStroke('N', java.awt.event.KeyEvent.CTRL_MASK));
       
       newItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	             JOptionPane.showConfirmDialog(null, "您点击了新建菜单项", "提示信息", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_OPTION);	
	             
			}
    	   
       });
       
       JMenuItem openItem = new JMenuItem("打开");
       JMenuItem saveItem = new JMenuItem("保存");
       JMenuItem quitItem = new JMenuItem("退出");
       
       quitItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			   int result =	JOptionPane.showConfirmDialog(null, "您真的要退出系统吗？", "提示信息", JOptionPane.OK_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, new ImageIcon("pic/tip.gif"));
			   if(result==JOptionPane.OK_OPTION)
			   {
				   System.exit(0); //退出系统
			   }
			   else
			   {
				   return;
			   }
			}
    	   
       });
       
       fileMenu.add(newItem);
       fileMenu.add(openItem);
       //添加分隔符
       fileMenu.addSeparator();
       fileMenu.add(saveItem);
       fileMenu.add(quitItem);
       
       
       
       //如何让窗体显示在屏幕中央
       int screen_width = (int)frame.getToolkit().getScreenSize().getWidth(); //得到屏幕的宽度
	   int screen_height = (int)frame.getToolkit().getScreenSize().getHeight(); //得到屏幕的高度
       
	   bar.add(fileMenu);
	   //给窗体添加菜单栏
	   frame.setJMenuBar(bar);
	   
	   frame.setLocation((screen_width-width)/2, (screen_height-height)/2);
	   frame.setResizable(false);
	   frame.setVisible(true);
	   
	   
	}

}

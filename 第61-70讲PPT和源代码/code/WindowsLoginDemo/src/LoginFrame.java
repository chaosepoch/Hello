import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginFrame extends MyFrame implements ActionListener{

	int width=400; //窗体的宽度
    int height=200;//高度
    
	public LoginFrame (String title)
	{
		super(title);
		//最大的面板
		JPanel pan = new JPanel();
		pan.setLayout(new BorderLayout());
		
		//系统登录标题面板
		JPanel title_pan = new JPanel();
		JLabel title_lab = new JLabel("系统登录",SwingConstants.CENTER);
		title_lab.setFont(new Font("黑体",Font.BOLD,20));
		
		//放按钮的面板
		JPanel button_pan = new JPanel();
		JButton login_btn = new JButton("登录");
		JButton cancel_btn = new JButton("取消");
		
		login_btn.addActionListener(this);
		cancel_btn.addActionListener(this);
		
		//放置用户名和密码的面板
		JPanel content_pan = new JPanel();
		//采用两行一列的表格布局
		content_pan.setLayout(new GridLayout(2,1));
		
		JPanel username_pan = new JPanel();
		JPanel password_pan = new JPanel();
		
		JLabel username_lab = new JLabel("用户名：",SwingConstants.RIGHT);
		JLabel passowrd_lab = new JLabel("密码：",SwingConstants.RIGHT);
		
		JTextField username = new JTextField();
		JPasswordField password = new JPasswordField();
		username.setColumns(15);
		password.setColumns(15);
		
	    
		username_pan.add(username_lab);
		username_pan.add(username);
		
		password_pan.add(passowrd_lab);
		password_pan.add(password);
		
		content_pan.add(username_pan);
		content_pan.add(password_pan);
		
		button_pan.add(login_btn);
		button_pan.add(cancel_btn);
		
		
		title_pan.add(title_lab);
		pan.add(title_pan,BorderLayout.NORTH);
		pan.add(button_pan,BorderLayout.SOUTH);
		pan.add(content_pan,BorderLayout.CENTER);
		this.add(pan);
		
		this.setSize(width, height);
		int screen_width = (int)this.getToolkit().getScreenSize().getWidth(); //得到屏幕的宽度
		int screen_height = (int)this.getToolkit().getScreenSize().getHeight(); //得到屏幕的高度
		this.setLocation((screen_width-width)/2, (screen_height-height)/2);
		this.setResizable(false);
		this.setVisible(true);   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn =(JButton)e.getSource();
		if(btn.getText().equals("登录"))
		{
		   //显示主界面
		   MainFrame mainFrame = new MainFrame("学生管理系统");
		   this.setVisible(false); //隐藏登录窗体
		}
		else
		{
			System.exit(0);
		}
		
	}
}

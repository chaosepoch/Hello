import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import dao.UsersDAO;
import entity.Users;


public class RegFrame extends JFrame implements ActionListener{

	int width=400; //窗体的宽度
    int height=200;//高度
    
    private JTextField username = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JPasswordField confirmpass = new JPasswordField();
	private UsersDAO udao = new UsersDAO();
	
	public RegFrame (String title)
	{
		super(title);
		//最大的面板
		JPanel pan = new JPanel();
		pan.setLayout(new BorderLayout());
		
		//系统登录标题面板
		JPanel title_pan = new JPanel();
		JLabel title_lab = new JLabel("用户注册",SwingConstants.CENTER);
		title_lab.setFont(new Font("黑体",Font.BOLD,20));
		
		//放按钮的面板
		JPanel button_pan = new JPanel();
		JButton reg_btn = new JButton("注册");
		JButton cancel_btn = new JButton("取消");
		
		reg_btn.addActionListener(this);
		cancel_btn.addActionListener(this);
		
		//放置用户名和密码的面板
		JPanel content_pan = new JPanel();
		//采用两行一列的表格布局
		content_pan.setLayout(new GridLayout(3,1));
		
		JPanel username_pan = new JPanel();
		JPanel password_pan = new JPanel();
		JPanel confirmpass_pan =new JPanel();
		
		JLabel username_lab = new JLabel("",SwingConstants.RIGHT);
		username_lab.setText("用 户 名：");
		JLabel password_lab = new JLabel("",SwingConstants.RIGHT);
		password_lab.setText("密       码：");
		JLabel confirmpass_lab = new JLabel("",SwingConstants.RIGHT);
		confirmpass_lab.setText("确认密码：");
		
		
		
		username.setColumns(15);
		password.setColumns(15);
		confirmpass.setColumns(15);
	    
		username_pan.add(username_lab);
		username_pan.add(username);
		
		password_pan.add(password_lab);
		password_pan.add(password);
		
		confirmpass_pan.add(confirmpass_lab);
		confirmpass_pan.add(confirmpass);
		
		content_pan.add(username_pan);
		content_pan.add(password_pan);
		content_pan.add(confirmpass_pan);
		
		
		button_pan.add(reg_btn);
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

	//表单验证
	private boolean validateForm()
	{
		if(username.getText().trim().length()==0)
		{
			 JOptionPane.showMessageDialog(null, "用户名不能为空！", "提示信息", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
		     username.grabFocus(); //获取光标
		     return false;
		}
		if(new String(password.getPassword()).trim().length()==0)
		{
			 JOptionPane.showMessageDialog(null, "密码不能为空！", "提示信息", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
		     password.grabFocus(); //获取光标
		     return false;
		}
		if(! new String(password.getPassword()).trim().equals(new String(confirmpass.getPassword()).trim()))
		{
			 JOptionPane.showMessageDialog(null, "密码与确认密码不一致！", "提示信息", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
		     confirmpass.grabFocus(); //获取光标
		     return false;
		}
		return true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn =(JButton)e.getSource();
		
		//先进行表单验证
		if(!validateForm())
		{
			return;
		}
		
		if(btn.getText().equals("注册"))
		{
		   //执行用户注册
		   Users u = new Users(); 
		   u.setUsername(username.getText().trim());	
		   u.setPassword(new String(password.getPassword()).trim());
		   if(udao.userRegister(u))
		   {
			   JOptionPane.showMessageDialog(null, "注册成功！", "提示信息", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
			   this.dispose();
		   }
		   else
		   {
			   JOptionPane.showMessageDialog(null, "注册失败！", "提示信息", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
			   this.dispose();
		   }
		}
		else
		{
			this.dispose(); //关闭当前窗口
		}
		
	}
}

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

	int width=400; //����Ŀ��
    int height=200;//�߶�
    
    private JTextField username = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JPasswordField confirmpass = new JPasswordField();
	private UsersDAO udao = new UsersDAO();
	
	public RegFrame (String title)
	{
		super(title);
		//�������
		JPanel pan = new JPanel();
		pan.setLayout(new BorderLayout());
		
		//ϵͳ��¼�������
		JPanel title_pan = new JPanel();
		JLabel title_lab = new JLabel("�û�ע��",SwingConstants.CENTER);
		title_lab.setFont(new Font("����",Font.BOLD,20));
		
		//�Ű�ť�����
		JPanel button_pan = new JPanel();
		JButton reg_btn = new JButton("ע��");
		JButton cancel_btn = new JButton("ȡ��");
		
		reg_btn.addActionListener(this);
		cancel_btn.addActionListener(this);
		
		//�����û�������������
		JPanel content_pan = new JPanel();
		//��������һ�еı�񲼾�
		content_pan.setLayout(new GridLayout(3,1));
		
		JPanel username_pan = new JPanel();
		JPanel password_pan = new JPanel();
		JPanel confirmpass_pan =new JPanel();
		
		JLabel username_lab = new JLabel("",SwingConstants.RIGHT);
		username_lab.setText("�� �� ����");
		JLabel password_lab = new JLabel("",SwingConstants.RIGHT);
		password_lab.setText("��       �룺");
		JLabel confirmpass_lab = new JLabel("",SwingConstants.RIGHT);
		confirmpass_lab.setText("ȷ�����룺");
		
		
		
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
		int screen_width = (int)this.getToolkit().getScreenSize().getWidth(); //�õ���Ļ�Ŀ��
		int screen_height = (int)this.getToolkit().getScreenSize().getHeight(); //�õ���Ļ�ĸ߶�
		this.setLocation((screen_width-width)/2, (screen_height-height)/2);
		this.setResizable(false);
		this.setVisible(true);   
	}

	//����֤
	private boolean validateForm()
	{
		if(username.getText().trim().length()==0)
		{
			 JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�", "��ʾ��Ϣ", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
		     username.grabFocus(); //��ȡ���
		     return false;
		}
		if(new String(password.getPassword()).trim().length()==0)
		{
			 JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ�", "��ʾ��Ϣ", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
		     password.grabFocus(); //��ȡ���
		     return false;
		}
		if(! new String(password.getPassword()).trim().equals(new String(confirmpass.getPassword()).trim()))
		{
			 JOptionPane.showMessageDialog(null, "������ȷ�����벻һ�£�", "��ʾ��Ϣ", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
		     confirmpass.grabFocus(); //��ȡ���
		     return false;
		}
		return true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn =(JButton)e.getSource();
		
		//�Ƚ��б���֤
		if(!validateForm())
		{
			return;
		}
		
		if(btn.getText().equals("ע��"))
		{
		   //ִ���û�ע��
		   Users u = new Users(); 
		   u.setUsername(username.getText().trim());	
		   u.setPassword(new String(password.getPassword()).trim());
		   if(udao.userRegister(u))
		   {
			   JOptionPane.showMessageDialog(null, "ע��ɹ���", "��ʾ��Ϣ", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
			   this.dispose();
		   }
		   else
		   {
			   JOptionPane.showMessageDialog(null, "ע��ʧ�ܣ�", "��ʾ��Ϣ", JOptionPane.NO_OPTION, new ImageIcon("pic/tip.gif"));
			   this.dispose();
		   }
		}
		else
		{
			this.dispose(); //�رյ�ǰ����
		}
		
	}
}

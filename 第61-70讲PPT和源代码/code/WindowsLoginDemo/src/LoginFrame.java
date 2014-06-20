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

	int width=400; //����Ŀ��
    int height=200;//�߶�
    
	public LoginFrame (String title)
	{
		super(title);
		//�������
		JPanel pan = new JPanel();
		pan.setLayout(new BorderLayout());
		
		//ϵͳ��¼�������
		JPanel title_pan = new JPanel();
		JLabel title_lab = new JLabel("ϵͳ��¼",SwingConstants.CENTER);
		title_lab.setFont(new Font("����",Font.BOLD,20));
		
		//�Ű�ť�����
		JPanel button_pan = new JPanel();
		JButton login_btn = new JButton("��¼");
		JButton cancel_btn = new JButton("ȡ��");
		
		login_btn.addActionListener(this);
		cancel_btn.addActionListener(this);
		
		//�����û�������������
		JPanel content_pan = new JPanel();
		//��������һ�еı�񲼾�
		content_pan.setLayout(new GridLayout(2,1));
		
		JPanel username_pan = new JPanel();
		JPanel password_pan = new JPanel();
		
		JLabel username_lab = new JLabel("�û�����",SwingConstants.RIGHT);
		JLabel passowrd_lab = new JLabel("���룺",SwingConstants.RIGHT);
		
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
		int screen_width = (int)this.getToolkit().getScreenSize().getWidth(); //�õ���Ļ�Ŀ��
		int screen_height = (int)this.getToolkit().getScreenSize().getHeight(); //�õ���Ļ�ĸ߶�
		this.setLocation((screen_width-width)/2, (screen_height-height)/2);
		this.setResizable(false);
		this.setVisible(true);   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn =(JButton)e.getSource();
		if(btn.getText().equals("��¼"))
		{
		   //��ʾ������
		   MainFrame mainFrame = new MainFrame("ѧ������ϵͳ");
		   this.setVisible(false); //���ص�¼����
		}
		else
		{
			System.exit(0);
		}
		
	}
}

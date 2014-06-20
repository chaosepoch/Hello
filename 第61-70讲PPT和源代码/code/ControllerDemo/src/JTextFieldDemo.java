import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JTextFieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("我的Windows窗体");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("用户名：");
	    JTextField txtUsername = new JTextField();
	    txtUsername.setColumns(15);
	    txtUsername.setText("请输入用户名");
	    //设置是否可用
	    //txtUsername.setEnabled(false);
	    //设置只读
	    //txtUsername.setEditable(false);
	    pan.add(lab);
	    pan.add(txtUsername);
	   
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
	}

}

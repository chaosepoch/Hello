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
		MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("�û�����");
	    JTextField txtUsername = new JTextField();
	    txtUsername.setColumns(15);
	    txtUsername.setText("�������û���");
	    //�����Ƿ����
	    //txtUsername.setEnabled(false);
	    //����ֻ��
	    //txtUsername.setEditable(false);
	    pan.add(lab);
	    pan.add(txtUsername);
	   
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
	}

}

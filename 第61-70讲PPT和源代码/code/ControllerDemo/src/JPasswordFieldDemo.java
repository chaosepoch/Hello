import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class JPasswordFieldDemo {
   public static void main(String[] args) {
	    MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("���룺");
	    JPasswordField txtPassword = new JPasswordField();
	    txtPassword.setColumns(15);
	    
	    //�����Ƿ����
	    //txtUsername.setEnabled(false);
	    //����ֻ��
	    //txtUsername.setEditable(false);
	    pan.add(lab);
	    pan.add(txtPassword);
	   
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
   }
}

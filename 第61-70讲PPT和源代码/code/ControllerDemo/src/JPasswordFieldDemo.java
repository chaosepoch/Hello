import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class JPasswordFieldDemo {
   public static void main(String[] args) {
	    MyFrame frame = new MyFrame("我的Windows窗体");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("密码：");
	    JPasswordField txtPassword = new JPasswordField();
	    txtPassword.setColumns(15);
	    
	    //设置是否可用
	    //txtUsername.setEnabled(false);
	    //设置只读
	    //txtUsername.setEditable(false);
	    pan.add(lab);
	    pan.add(txtPassword);
	   
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
   }
}

import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class JButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    Icon ico = new ImageIcon("logo.gif");
        //JLabel lab = new JLabel("��ӭ���ѧϰGUI���",ico,SwingConstants.CENTER);
        JButton btn = new JButton("���԰�ť",ico);
	    btn.setFont(new Font("����",Font.BOLD,30));
        pan.add(btn);
        
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
        
	}

}

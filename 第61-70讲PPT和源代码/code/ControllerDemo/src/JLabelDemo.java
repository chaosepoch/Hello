import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class JLabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    Icon ico = new ImageIcon("logo.gif");
        JLabel lab = new JLabel("��ӭ���ѧϰGUI���",ico,SwingConstants.CENTER);
        lab.setFont(new Font("����",Font.BOLD,30));
        pan.add(lab);
        
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
        
	}

}

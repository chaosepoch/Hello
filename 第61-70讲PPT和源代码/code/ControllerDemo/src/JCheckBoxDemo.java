import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JCheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("���ã�");
	    JCheckBox chBox1 = new JCheckBox("����");
	    JCheckBox chBox2 = new JCheckBox("����");
	    JCheckBox chBox3 = new JCheckBox("��Ӱ");
	    JCheckBox chBox4 = new JCheckBox("NBA");
	    JCheckBox chBox5 = new JCheckBox("����");
	    
	    pan.add(lab);
	    pan.add(chBox1);
	    pan.add(chBox2);
	    pan.add(chBox3);
	    pan.add(chBox4);
	    pan.add(chBox5);
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
	}

}

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class JRadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("�Ա�");
	    ButtonGroup group = new ButtonGroup();
	    
	    JRadioButton male = new JRadioButton("��");
	    JRadioButton female = new JRadioButton("Ů");
	    group.add(male);
	    group.add(female);
	    male.setSelected(true); //��Ĭ�ϱ�ѡ��
	    pan.add(lab);
	    pan.add(male);
	    pan.add(female);
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
	}

}

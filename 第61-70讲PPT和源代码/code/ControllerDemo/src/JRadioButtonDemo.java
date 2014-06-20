import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class JRadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("我的Windows窗体");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("性别：");
	    ButtonGroup group = new ButtonGroup();
	    
	    JRadioButton male = new JRadioButton("男");
	    JRadioButton female = new JRadioButton("女");
	    group.add(male);
	    group.add(female);
	    male.setSelected(true); //男默认被选中
	    pan.add(lab);
	    pan.add(male);
	    pan.add(female);
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);
	}

}

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JCheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("我的Windows窗体");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("爱好：");
	    JCheckBox chBox1 = new JCheckBox("读书");
	    JCheckBox chBox2 = new JCheckBox("音乐");
	    JCheckBox chBox3 = new JCheckBox("电影");
	    JCheckBox chBox4 = new JCheckBox("NBA");
	    JCheckBox chBox5 = new JCheckBox("上网");
	    
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

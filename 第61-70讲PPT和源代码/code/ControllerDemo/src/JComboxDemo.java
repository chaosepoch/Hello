import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;


public class JComboxDemo {
   public static void main(String[] args) {
	    MyFrame frame = new MyFrame("我的Windows窗体");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("请选择：");
	    //String[] nations = {"---请选择---","巴西","阿根廷","德国","意大利","西班牙","荷兰","法国"};
	    Vector<String> nations = new Vector<String>();
	    nations.add("---请选择---");
	    nations.add("巴西");
	    nations.add("阿根廷");
	    nations.add("德国");
	    nations.add("意大利");
	    nations.add("荷兰");
	    
	    JComboBox list = new JComboBox(nations);
	    //鼠标停在上面的提示信息
	    //list.setToolTipText("您支持哪个球队？");
	    
	    //list.setBorder(BorderFactory.createTitledBorder("您支持哪个球队？"));
	    //list.setFixedCellHeight(300);
	    
	    //list.setFixedCellWidth(180);
	    //设置只能单选
	    //list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    pan.add(lab);
	    pan.add(list);
	   
	    
	    frame.add(pan);
       frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);  
   }
}

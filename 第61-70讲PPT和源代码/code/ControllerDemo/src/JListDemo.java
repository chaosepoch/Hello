import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class JListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("我的Windows窗体");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("请选择：");
	    String[] nations = {"巴西","阿根廷","德国","意大利","西班牙","荷兰","法国"};
	    JList list = new JList(nations);
	    //鼠标停在上面的提示信息
	    list.setToolTipText("您支持哪个球队？");
	    
	    list.setBorder(BorderFactory.createTitledBorder("您支持哪个球队？"));
	    //list.setFixedCellHeight(300);
	    
	    list.setFixedCellWidth(180);
	    //设置只能单选
	    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    pan.add(lab);
	    pan.add(list);
	   
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);  
	}

}

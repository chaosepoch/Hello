import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class JListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("��ѡ��");
	    String[] nations = {"����","����͢","�¹�","�����","������","����","����"};
	    JList list = new JList(nations);
	    //���ͣ���������ʾ��Ϣ
	    list.setToolTipText("��֧���ĸ���ӣ�");
	    
	    list.setBorder(BorderFactory.createTitledBorder("��֧���ĸ���ӣ�"));
	    //list.setFixedCellHeight(300);
	    
	    list.setFixedCellWidth(180);
	    //����ֻ�ܵ�ѡ
	    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    pan.add(lab);
	    pan.add(list);
	   
	    
	    frame.add(pan);
        frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);  
	}

}

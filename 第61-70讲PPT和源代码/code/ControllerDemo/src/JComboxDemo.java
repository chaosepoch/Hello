import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;


public class JComboxDemo {
   public static void main(String[] args) {
	    MyFrame frame = new MyFrame("�ҵ�Windows����");
	    JPanel pan = new JPanel();
	    JLabel lab = new JLabel("��ѡ��");
	    //String[] nations = {"---��ѡ��---","����","����͢","�¹�","�����","������","����","����"};
	    Vector<String> nations = new Vector<String>();
	    nations.add("---��ѡ��---");
	    nations.add("����");
	    nations.add("����͢");
	    nations.add("�¹�");
	    nations.add("�����");
	    nations.add("����");
	    
	    JComboBox list = new JComboBox(nations);
	    //���ͣ���������ʾ��Ϣ
	    //list.setToolTipText("��֧���ĸ���ӣ�");
	    
	    //list.setBorder(BorderFactory.createTitledBorder("��֧���ĸ���ӣ�"));
	    //list.setFixedCellHeight(300);
	    
	    //list.setFixedCellWidth(180);
	    //����ֻ�ܵ�ѡ
	    //list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    pan.add(lab);
	    pan.add(list);
	   
	    
	    frame.add(pan);
       frame.setSize(600, 400);
	    frame.setLocation(0, 0);
	    frame.setVisible(true);  
   }
}

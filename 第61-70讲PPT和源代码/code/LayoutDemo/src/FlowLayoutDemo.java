import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//�����ֹ�����
public class FlowLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MyFrame frame = new MyFrame("�ҵ�windows����");
		
		JPanel pan = new JPanel();
		JButton btn1 = new JButton("��ť1");
		JButton btn2 = new JButton("��ť2");
		JButton btn3 = new JButton("��ť3");
		
		//ָ�����ʹ�������ֹ�����;
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);//ָ��Ϊ�����
		pan.setLayout(layout);
		
		//����ť���������
		pan.add(btn1);//Ĭ��ʹ�õ��������ֹ�����
		pan.add(btn2);
		pan.add(btn3);
		
		//�������ڴ�����
		frame.add(pan);
		
		frame.setSize(600, 500);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		
	}

}

import javax.swing.JFrame;
import javax.swing.WindowConstants;


//��д�û��Զ���Ĵ��������̳�JFrame��
class MyFrame extends JFrame
{
   public MyFrame(String title)
   {
	   this.setTitle(title); //���ô��ڵı���
	   //���ô���Ĭ�ϵĹر���Ϊ
	   this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }
}

public class JFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyFrame frame = new MyFrame("�ҵĵ�һ��JAVAͼ�δ���");
        frame.setSize(600, 500);
        frame.setLocation(0, 0);
        frame.setVisible(true);//���ô��ڿɼ�
	}

}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class OuterClass implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "测试按钮被点击了", "提示信息", JOptionPane.DEFAULT_OPTION);				
	}
	
}


//编写用户自定义的窗口类必须继承JFrame类
class MyJFrame extends JFrame implements ActionListener
{
	
   static class InnerClass implements ActionListener
   {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showConfirmDialog(null, "测试按钮被点击了", "提示信息", JOptionPane.DEFAULT_OPTION);				
		}
	   
   }
	
   public MyJFrame(String title) 
   {
	   this.setTitle(title); //设置窗口的标题
	   //设置窗口默认的关闭行为
	   this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       //创建一个面板对象，面板就是一个组件容器
	   JPanel pan = new JPanel();
	   JButton button = new JButton("测试按钮");
	   this.add(pan);
	   pan.add(button);
	   //1.使用匿名的内部类
	   /*
	   button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
               JOptionPane.showConfirmDialog(null, "测试按钮被点击了", "提示信息", JOptionPane.DEFAULT_OPTION);				
			}
		   
	   });*/
	   
	   //2.通过内部类实现
	   /*
	   button.addActionListener(new InnerClass());*/
       //3.通过外部类实现
	   /*button.addActionListener(new OuterClass());*/
	   
	   //4.本身实现ActionListener接口，注册当前窗口对象
	   button.addActionListener(this);
	   
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JOptionPane.showConfirmDialog(null, "测试按钮被点击了", "提示信息", JOptionPane.DEFAULT_OPTION);				
	}
}

public class MyListenerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyJFrame frame = new MyJFrame("我的第一个JAVA图形窗口");
        frame.setSize(600, 500);
        frame.setLocation(0, 0);
        frame.setVisible(true);//设置窗口可见
	}

}

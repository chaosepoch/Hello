//ˮ��
public class Cup {

	String owner;//ˮ��������
	String content;//ˮ����Ķ���
	
	Cup()
	{
		
	}
	Cup(String owner,String content)
	{
		this.owner = owner;
		this.content = content;
	}
	
	public static void changeContent(Cup c) //���ô���
	{
		System.out.println("��changContent�������棺"+c.hashCode());
		//c.content = "�ն���";
		c = new Cup("���޼�","�ɿڿ���");
		System.out.println("��changContent�������棺"+c.hashCode());
	}
	
	public void showContent()
	{
		System.out.println(this.owner+"��ˮ��������װ�ţ�"+this.content);
	}
	
	public static void main(String[] args)
	{
		Cup c = new Cup("������","���ݴ�");
		c.showContent();
		System.out.println("--------------------");
		System.out.println("�����������棺"+c.hashCode());
		Cup.changeContent(c);
		c.showContent();
	}
}

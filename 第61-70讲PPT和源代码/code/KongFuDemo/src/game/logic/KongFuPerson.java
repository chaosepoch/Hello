package game.logic;

//���书����
public class KongFuPerson extends Person {
   
	protected int blood = 1000;//Ĭ�϶���1000��Ѫ��
	
	KongFuPerson()
	{
		
	}
	KongFuPerson(String name)
	{
		this.name = name;
	}
	
	//��ͨ����
	public void commonSkill(KongFuPerson p)
	{
        p.blood-=50;  //��������50��Ѫ��		
	}
	
	//ɱ��ʽ
	public void bestSkill(KongFuPerson p)
	{
	   p.blood -= 100; //��������100��Ѫ
	}
	
	public int getBlood() {
		return blood;
	}
	
	public void setBlood(int blood) {
		this.blood = blood;
	}
}

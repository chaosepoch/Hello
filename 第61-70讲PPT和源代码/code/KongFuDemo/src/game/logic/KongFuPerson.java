package game.logic;

//会武功的人
public class KongFuPerson extends Person {
   
	protected int blood = 1000;//默认都是1000点血；
	
	KongFuPerson()
	{
		
	}
	KongFuPerson(String name)
	{
		this.name = name;
	}
	
	//普通招数
	public void commonSkill(KongFuPerson p)
	{
        p.blood-=50;  //攻击敌人50点血；		
	}
	
	//杀招式
	public void bestSkill(KongFuPerson p)
	{
	   p.blood -= 100; //攻击敌人100点血
	}
	
	public int getBlood() {
		return blood;
	}
	
	public void setBlood(int blood) {
		this.blood = blood;
	}
}

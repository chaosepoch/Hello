package game.roles;

import game.logic.KongFuMaster;
import game.logic.KongFuPerson;

//令狐冲类
public class Linghuchong extends KongFuMaster{

	public Linghuchong()
	{
		
	}
	public Linghuchong(String name)
	{
		this.name = name;
	}
	
	@Override
	public void secrets(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.secrets(p);
		System.out.println(this.getName()+"使用武功绝学独孤九剑攻击"+p.getName()+"300点血！");
	}

	@Override
	public void commonSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.commonSkill(p);
		System.out.println(this.getName()+"使用越女剑法攻击"+p.getName()+"50点血！");
	}

	@Override
	public void bestSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.bestSkill(p);
		System.out.println(this.getName()+"使用华山剑法攻击"+p.getName()+"100点血！");
	}

}

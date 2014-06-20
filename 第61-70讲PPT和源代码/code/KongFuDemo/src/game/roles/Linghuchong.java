package game.roles;

import game.logic.KongFuMaster;
import game.logic.KongFuPerson;

//�������
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
		System.out.println(this.getName()+"ʹ���书��ѧ���¾Ž�����"+p.getName()+"300��Ѫ��");
	}

	@Override
	public void commonSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.commonSkill(p);
		System.out.println(this.getName()+"ʹ��ԽŮ��������"+p.getName()+"50��Ѫ��");
	}

	@Override
	public void bestSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.bestSkill(p);
		System.out.println(this.getName()+"ʹ�û�ɽ��������"+p.getName()+"100��Ѫ��");
	}

}

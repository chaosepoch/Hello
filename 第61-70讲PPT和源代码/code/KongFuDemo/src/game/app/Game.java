package game.app;

import game.logic.KongFuMaster;
import game.roles.Linghuchong;
import game.roles.Ouyangfeng;

import java.util.Scanner;

public class Game {

	public static Scanner in = new Scanner(System.in);
	public static int choice;//�û���ѡ��
	public static KongFuMaster player;//���
	public static KongFuMaster computer;//����
	public static boolean isFirst=true;//Ĭ����Ҵ����
	
	//��Ϸ��ɫ��ʼ������
	public static void init()
	{
		switch(choice)
		{
		   case 1:
			   player = new Linghuchong("�����");
			   computer = new Ouyangfeng("ŷ����");
			   break;
		   case 2:
			   computer = new Linghuchong("�����");
			   player = new Ouyangfeng("ŷ����");
			   break;
		}
		System.out.println("��ѡ���ˣ�"+player.getName());
	}
	
	//��ʾ��Ϸ�˵�
	public static void showMenu()
	{
		System.out.println("**********��ӭ�����ӹȺ����***********");
		System.out.println("1.�����      2.ŷ����");
		System.out.println("��ѡ��");
		choice = in.nextInt();
	}
	
	//��ϷPK����
	public static void beginCombat(KongFuMaster player,KongFuMaster computer)
	{
		//����һ��1-3֮��������
		int temp = (int)(Math.random()*10)%3; //0-2;
		temp++;
		switch(temp)
		{
		    case 1:
			    if(Game.isFirst)
			    {
			    	player.commonSkill(computer);
			    }
			    else
			    {
			    	computer.commonSkill(player);
			    }
			    break;
		    case 2:
			    if(Game.isFirst)
			    {
			    	player.bestSkill(computer);
			    }
			    else
			    {
			    	computer.bestSkill(player);
			    }
			    break; 
		    case 3:
			    if(Game.isFirst)
			    {
			    	player.secrets(computer);
			    }
			    else
			    {
			    	computer.secrets(player);
			    }
			    break;
		}
		Game.isFirst=!Game.isFirst;
	}
	
	//�ж���Ϸ�Ƿ����
	public static boolean isComplete()
	{
	    if(Game.player.getBlood()<=0||Game.computer.getBlood()<=0)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
	
	//��ʾ��Ϸ���
	public static void showResult()
	{
		if(Game.player.getBlood()<=0)
		{
			System.out.println("���ӱ���ʮ�겻�����Ǻ������....");
		}
		else
		{
			System.out.println("����Ľ�磬��ֻ��һ������....");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game.showMenu(); //��ʾ�˵�
        Game.init();//��ʼ����Ϸ
        
        do{
        	//��ʼPK
        	Game.beginCombat(player, computer);
        }while(!Game.isComplete());//�ж��Ƿ����
        
        Game.showResult();//��ʾ��Ϸ���
	}

}

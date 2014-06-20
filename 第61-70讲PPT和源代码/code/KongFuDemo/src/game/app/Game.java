package game.app;

import game.logic.KongFuMaster;
import game.roles.Linghuchong;
import game.roles.Ouyangfeng;

import java.util.Scanner;

public class Game {

	public static Scanner in = new Scanner(System.in);
	public static int choice;//用户的选择
	public static KongFuMaster player;//玩家
	public static KongFuMaster computer;//电脑
	public static boolean isFirst=true;//默认玩家打电脑
	
	//游戏角色初始化方法
	public static void init()
	{
		switch(choice)
		{
		   case 1:
			   player = new Linghuchong("令狐冲");
			   computer = new Ouyangfeng("欧阳锋");
			   break;
		   case 2:
			   computer = new Linghuchong("令狐冲");
			   player = new Ouyangfeng("欧阳锋");
			   break;
		}
		System.out.println("您选择了："+player.getName());
	}
	
	//显示游戏菜单
	public static void showMenu()
	{
		System.out.println("**********欢迎进入金庸群侠传***********");
		System.out.println("1.令狐冲      2.欧阳锋");
		System.out.println("请选择：");
		choice = in.nextInt();
	}
	
	//游戏PK方法
	public static void beginCombat(KongFuMaster player,KongFuMaster computer)
	{
		//生成一个1-3之间的随机数
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
	
	//判断游戏是否结束
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
	
	//显示游戏结果
	public static void showResult()
	{
		if(Game.player.getBlood()<=0)
		{
			System.out.println("君子报仇十年不晚，咱们后会有期....");
		}
		else
		{
			System.out.println("别羡慕哥，哥只是一个传奇....");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game.showMenu(); //显示菜单
        Game.init();//初始化游戏
        
        do{
        	//开始PK
        	Game.beginCombat(player, computer);
        }while(!Game.isComplete());//判断是否结束
        
        Game.showResult();//显示游戏结果
	}

}

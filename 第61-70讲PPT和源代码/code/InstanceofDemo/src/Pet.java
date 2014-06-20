//宠物类
public class Pet extends Animal {
   
	String name; //宠物的昵称
	
	//陪主人玩
	public void playWithOwner()
	{
		System.out.println(this.name+"陪主人玩...");
	}
}

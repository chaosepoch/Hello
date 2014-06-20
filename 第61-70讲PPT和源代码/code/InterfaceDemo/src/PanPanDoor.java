//盼盼防盗门
public class PanPanDoor extends Door implements Alarm{

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("小偷撬门了，报警....");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("盼盼防盗门开....");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("盼盼防盗门关....");
	}


	public static void main(String[] args) {
		Door door = new PanPanDoor();
		
		door.open();
		door.close();
		((PanPanDoor)door).alarm();
	}
}

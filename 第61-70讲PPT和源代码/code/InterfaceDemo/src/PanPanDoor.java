//���η�����
public class PanPanDoor extends Door implements Alarm{

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("С͵�����ˣ�����....");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("���η����ſ�....");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("���η����Ź�....");
	}


	public static void main(String[] args) {
		Door door = new PanPanDoor();
		
		door.open();
		door.close();
		((PanPanDoor)door).alarm();
	}
}

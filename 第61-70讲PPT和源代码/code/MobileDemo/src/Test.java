
public class Test {

	
	public static void main(String[] args) {
		
		Samsung sam = new Samsung("����","��ɫ");
		Apple app = new Apple("ƻ��","��ɫ");
		HTC htc = new HTC("HTC","��ɫ");
		
		sam.powerOn();
		sam.powerOff();
		sam.internet();
		sam.music();
		
		System.out.println("----------------------");
		
		app.powerOn();
		app.powerOff();
		app.internet();
		app.camera();
		
        System.out.println("----------------------");
		
        htc.powerOn();
        htc.powerOff();
        htc.internet();
        htc.camera();
		
	}

}

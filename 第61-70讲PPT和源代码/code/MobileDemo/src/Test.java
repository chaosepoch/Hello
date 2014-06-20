
public class Test {

	
	public static void main(String[] args) {
		
		Samsung sam = new Samsung("三星","白色");
		Apple app = new Apple("苹果","红色");
		HTC htc = new HTC("HTC","黑色");
		
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

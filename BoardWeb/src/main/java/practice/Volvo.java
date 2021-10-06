package practice;

public class Volvo implements Car {

	private Key key;
	
	public Volvo(Key key){
		System.out.println("Volvo ∞¥√º ª˝º∫µ ");
		this.key = key;
	}
	
	public void On() {
		key.start();
	}
	public void off() {
		key.stop();
	}

	public void start() {
		System.out.println("Volvo √‚πﬂ«’¥œ¥Ÿ.");
	}

	public void stop() {
		System.out.println("Volvo ∏ÿ√‰¥œ¥Ÿ.");
	}



	
}

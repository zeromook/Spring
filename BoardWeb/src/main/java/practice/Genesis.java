package practice;

public class Genesis implements Car {

	private Key key;
	
	public Genesis(Key key){
		System.out.println("Á¦³×½Ã½º °´Ã¼ »ı¼ºµÊ");
		this.key = key;
	}
	
	public void On() {
		key.start();
	}
	public void off() {
		key.stop();
	}

	public void start() {
		System.out.println("Genesis Ãâ¹ßÇÕ´Ï´Ù.");
	}

	public void stop() {
		System.out.println("Genesis ¸ØÃä´Ï´Ù.");
	}



	
}

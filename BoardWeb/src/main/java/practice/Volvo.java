package practice;

public class Volvo implements Car {

	private Key key;
	
	public Volvo(Key key){
		System.out.println("Volvo ��ü ������");
		this.key = key;
	}
	
	public void On() {
		key.start();
	}
	public void off() {
		key.stop();
	}

	public void start() {
		System.out.println("Volvo ����մϴ�.");
	}

	public void stop() {
		System.out.println("Volvo ����ϴ�.");
	}



	
}

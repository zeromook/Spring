package practice;

public class Genesis implements Car {

	private Key key;
	
	public Genesis(Key key){
		System.out.println("���׽ý� ��ü ������");
		this.key = key;
	}
	
	public void On() {
		key.start();
	}
	public void off() {
		key.stop();
	}

	public void start() {
		System.out.println("Genesis ����մϴ�.");
	}

	public void stop() {
		System.out.println("Genesis ����ϴ�.");
	}



	
}

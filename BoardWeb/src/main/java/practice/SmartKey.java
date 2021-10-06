package practice;

public class SmartKey implements Key {
	
	public SmartKey(){
		System.out.println("SmartKey 객체 생성");
	}

	public void start() {
		System.out.println("SmartKey로 시동을 켭니다.");
	}

	public void stop() {
		System.out.println("SmartKey로 시동을 끕니다.");
	}

	
}

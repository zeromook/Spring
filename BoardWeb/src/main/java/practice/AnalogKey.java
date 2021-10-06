package practice;

public class AnalogKey implements Key{

	public AnalogKey(){
		System.out.println("AnalogKey 객체 생성");
	}
	
	public void start() {
		System.out.println("AnalogKey로 시동을 켭니다.");
	}

	public void stop() {
		System.out.println("AnalogKey로 시동을 끕니다.");
	}

}

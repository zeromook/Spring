package practice;

public class AnalogKey implements Key{

	public AnalogKey(){
		System.out.println("AnalogKey ��ü ����");
	}
	
	public void start() {
		System.out.println("AnalogKey�� �õ��� �մϴ�.");
	}

	public void stop() {
		System.out.println("AnalogKey�� �õ��� ���ϴ�.");
	}

}

package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker(){
		System.out.println("====> AppleSpeaker ��ü ����");
	}
	
	
	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ� ���δ�.");
		
	}

}

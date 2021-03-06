package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		
//		BeanFactory factory = new BeanFactory();
//		
//		TV tv = (TV)factory.getBean(args[0]);
		
		//1. Spring 컨테이너 구동
		AbstractApplicationContext factoryContext = 
		          new GenericXmlApplicationContext("app2.xml");
		
		//2. Spring 컨테이너에서 요청(LookUp)
		TV tv = (TV)factoryContext.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring 컨테이너 종료
		factoryContext.close();
		
		
	}

}

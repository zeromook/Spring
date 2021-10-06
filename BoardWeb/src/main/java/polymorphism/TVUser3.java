package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser3 {

	public static void main(String[] args) {

		
		//1. Spring 컨테이너 구동
		AbstractApplicationContext factoryContext = 
		          new GenericXmlApplicationContext("app2.xml");
		
		//2. Spring 컨테이너에서 요청(LookUp)
		TV tv1 = (TV)factoryContext.getBean("tv");
	
		
		
		//3. Spring 컨테이너 종료
		factoryContext.close();
		
		
	}

}

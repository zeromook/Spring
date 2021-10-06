package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser3 {

	public static void main(String[] args) {

		
		//1. Spring �����̳� ����
		AbstractApplicationContext factoryContext = 
		          new GenericXmlApplicationContext("app2.xml");
		
		//2. Spring �����̳ʿ��� ��û(LookUp)
		TV tv1 = (TV)factoryContext.getBean("tv");
	
		
		
		//3. Spring �����̳� ����
		factoryContext.close();
		
		
	}

}

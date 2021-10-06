package practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RideCar {
	public static void main(String[] args) {
		
		AbstractApplicationContext carFactory = new GenericXmlApplicationContext("UseCar.xml");
		
		Car car = (Car)carFactory.getBean("car");
		car.start();
		car.stop();
		
		carFactory.close();
	}
}

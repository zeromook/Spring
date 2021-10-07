package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {

		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = 
								new GenericXmlApplicationContext("app3.xml");
		
		//2. Spring �����̳ʷ� ���� UserServiceImpl ��ü�� LookUp�Ѵ�.
		UserService userService = 
				(UserService)container.getBean("userService");
		
		
		//3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null){
			System.out.println(user.getName()+"�� ȯ���մϴ�.");
		}
		else{
			System.out.println("�α��� ����");
		}
		
		
		//4. Spring �����̳ʸ� �����Ѵ�.
		container.close();
		
	}

}

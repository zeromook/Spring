package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {

	
	
	//@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp){
		
		//시그니처(리턴타입,이름,매개변수) 정보가 저장된 Signature 객체 리턴
		String method = jp.getSignature().getName();
		//메소드 호출 시 넘겨준 인자목록 배열로
		Object[] args = jp.getArgs();
		
		System.out.println("BeforeAdvice [사전 처리] "+ method + "() 메소드  Argument 정보 : "+args[0].toString());
	}
}

package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointCut(){}
	
	
	//@Around("allPointCut()")
	public Object aroundLog(ProceedingJoinPoint pjp)throws Throwable{
		
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		System.out.println("[Before AroundAdvice] ����Ͻ� �޼ҵ� ���� ���� ó���� ����");
		
		Object returnObj = pjp.proceed();
		
		stopWatch.stop();
		
		System.out.println(method + "()�޼ҵ� ���࿡ �ɸ� �ð� : "+stopWatch.getTotalTimeMillis()+"(ms)��");
		
		System.out.println("[After AroundAdivice] ����Ͻ� �޼ҵ� ���� �Ŀ� ó���� ����");
		
		return returnObj;
	}
}

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
		
		//�ñ״�ó(����Ÿ��,�̸�,�Ű�����) ������ ����� Signature ��ü ����
		String method = jp.getSignature().getName();
		//�޼ҵ� ȣ�� �� �Ѱ��� ���ڸ�� �迭��
		Object[] args = jp.getArgs();
		
		System.out.println("BeforeAdvice [���� ó��] "+ method + "() �޼ҵ�  Argument ���� : "+args[0].toString());
	}
}

package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {

	public void beforeLog(JoinPoint jp){
		
		//�ñ״�ó(����Ÿ��,�̸�,�Ű�����) ������ ����� Signature ��ü ����
		String method = jp.getSignature().getName();
		//�޼ҵ� ȣ�� �� �Ѱ��� ���ڸ�� �迭��
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] "+ method + "() �޼ҵ�  Argument ���� : "+args[0].toString());
	}
}

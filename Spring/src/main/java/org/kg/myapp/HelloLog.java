package org.kg.myapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloLog {
	
	private void helloPOintcut() {}

	public void beforeLog(JoinPoint joinPoint) {
		Signature method = joinPoint.getSignature();
		System.out.println("클래스 : " +method.getDeclaringTypeName()+", 매서드 : "+method.getName());
		System.out.println("시작 시간 : " + new java.util.Date());
	}
	
	public void afterLog(JoinPoint joinPoint) {
		Signature method = joinPoint.getSignature();
		System.out.println("클래스 : " +method.getDeclaringTypeName()+", 매서드 : "+method.getName());
		System.out.println("종료 시간 : " + new java.util.Date());
	}
}

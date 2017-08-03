package com.xuefei.demo_aop3;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransationAop {
	
	public void begin() {
		System.out.println("=============");
	}
	public void close() {
		System.out.println("=============");
	}
	public void afterThrowing() {
		System.out.println("AfterThrowing");
	}
	public void afterReturning() {
		System.out.println("AfterReturning");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around before");
		pjp.proceed();
		System.out.println("around after");
	}
	
}

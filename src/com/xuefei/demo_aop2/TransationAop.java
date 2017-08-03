package com.xuefei.demo_aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("aop")
@Aspect  //设置切面类
public class TransationAop {
	
	//定义一个切入点表达式变量，使用时引用方法名称
	@Pointcut("execution(* com.xuefei.demo_aop2.UserDaoImpl.*(..))")
	public void Pointcut(){
	}
	
	@Before("execution(* com.xuefei.demo_aop2.UserDaoImpl.*(..))")
	public void begin() {
		System.out.println("=============");
	}
	@After("execution(* com.xuefei.demo_aop2.UserDaoImpl.*(..))")
	public void close() {
		System.out.println("=============");
	}
	@AfterThrowing("execution(* com.xuefei.demo_aop2.UserDaoImpl.*(..))")
	public void afterThrowing() {
		System.out.println("AfterThrowing");
	}
	@AfterReturning("execution(* com.xuefei.demo_aop2.UserDaoImpl.*(..))")
	public void afterReturning() {
		System.out.println("AfterReturning");
	}
	@Around("execution(* com.xuefei.demo_aop2.UserDaoImpl.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around before");
		pjp.proceed();
		System.out.println("around after");
	}
	
}

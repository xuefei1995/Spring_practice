package com.xuefei.demo_aop;

import org.springframework.stereotype.Component;

@Component("aop")
public class TransationAop {
	
	public void begin() {
		System.out.println("=============");
	}
	public void close() {
		System.out.println("=============");
	}
}

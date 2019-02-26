package com.luv2code.AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we adda ll of oure related advices for logging

	
	@Before("execution(* com.luv2code.AOPdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("===> Executing @Before Advice before the addAccount method in DAO");
	}
}

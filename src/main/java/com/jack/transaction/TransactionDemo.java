package com.jack.transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class TransactionDemo {

	public void point(){
		
	}
	
	//前置通知
	public void startTransaction(){
		System.out.println("begin transaction");
	}
	//后置通知
	public void commitTransaction(){
		System.out.println("commit transaction ");
	}
	//环绕通知
	public void around(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("begin transaction");
		joinPoint.proceed();
		System.out.println("commit transaction");
	}
}

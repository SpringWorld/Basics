package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogAfterService implements AfterReturningAdvice {

	
	@Override
	public void afterReturning(Object returnVal, Method arg1, Object[] arg2, Object Obj) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("executing standalone After Service ...");
		System.out.println(" return value :"+returnVal);
		System.out.println("Business object : "+Obj);
		
	}
}

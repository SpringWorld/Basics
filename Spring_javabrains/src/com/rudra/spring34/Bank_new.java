package com.rudra.spring34;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Bank_new implements MethodReplacer{

	@Override
	public Object reimplement(Object o, Method m, Object[] param) throws Throwable {
		// this method will act as a patch for the calculateInterest().
		System.out.println("Bank Interest(new/patched) calculator invoked");
		return o;
	}

	
}

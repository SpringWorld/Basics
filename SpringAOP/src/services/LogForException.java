package services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LogForException implements ThrowsAdvice {
	
	/**
	 * 
	 * There are not any methods on this interface, as methods are invoked by reflection. Implementing classes must implement methods of the form:
	
	void afterThrowing([Method, args, target], ThrowableSubclass);
	Some examples of valid methods would be:
	
	public void afterThrowing(Exception ex)
	public void afterThrowing(RemoteException)
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
	public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
	The first three arguments are optional, and only useful if we want further information about the joinpoint, as in AspectJ after-throwing advice.
	Note: If a throws-advice method throws an exception itself, it will override the original exception (i.e. change the exception thrown to the user). The overriding exception will typically be a RuntimeException; this is compatible with any method signature. However, if a throws-advice method throws a checked exception, it will have to match the declared exceptions of the target method and is hence to some degree coupled to specific target method signatures. Do not throw an undeclared checked exception that is incompatible with the target method's signature!
	 * 
	 * 
	 */
	public void afterThrowing(Exception ex){
		Log l = LogFactory.getLog(Bank.class);
		l.fatal("LogForException executed ... ");
	}
	
	
}

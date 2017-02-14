package pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositeMethodPointCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> obj) {
		String methodName = m.getName();
		if(methodName.equals("deposite")){
			return true;
		}else{
		return false;
		}
	}

}

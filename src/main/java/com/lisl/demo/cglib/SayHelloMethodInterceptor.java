package com.lisl.demo.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class SayHelloMethodInterceptor implements MethodInterceptor {

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		Object result = methodProxy.invokeSuper(obj, args);
		return "Addon by Cglib ==> " + result;
	}

}

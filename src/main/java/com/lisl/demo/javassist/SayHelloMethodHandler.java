package com.lisl.demo.javassist;

import java.lang.reflect.Method;

import com.lisl.demo.ISayHelloService;

import javassist.util.proxy.MethodHandler;

public class SayHelloMethodHandler implements MethodHandler {

	private ISayHelloService concreteSerivce;

	public SayHelloMethodHandler(ISayHelloService service) {
		this.concreteSerivce = service;
	}

	public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
		String result = (String) thisMethod.invoke(concreteSerivce, args);
		return "Addon by Javassist Proxy Factory ==> " + result;
	}

}

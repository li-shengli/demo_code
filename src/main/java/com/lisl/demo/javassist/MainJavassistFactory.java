package com.lisl.demo.javassist;

import com.lisl.demo.ISayHelloService;
import com.lisl.demo.SayHelloServiceImpl;

import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

public class MainJavassistFactory {

	public static void main(String[] args) throws Exception {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setSuperclass(SayHelloServiceImpl.class);
		
		@SuppressWarnings("unchecked")
		Class<ProxyObject> proxyClass = (Class<ProxyObject>) proxyFactory.createClass();
		ProxyObject service = proxyClass.newInstance();
		
		service.setHandler(new SayHelloMethodHandler(new SayHelloServiceImpl()));
		
		String result = ((ISayHelloService)service).sayHello("Li Si");
		System.out.println(result);
	}
}

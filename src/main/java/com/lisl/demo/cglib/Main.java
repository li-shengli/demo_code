package com.lisl.demo.cglib;

import com.lisl.demo.ISayHelloService;
import com.lisl.demo.SayHelloServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class Main {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(SayHelloServiceImpl.class);
		enhancer.setCallback(new SayHelloMethodInterceptor());
		
		ISayHelloService service = (ISayHelloService) enhancer.create();
		
		System.out.println(service.sayHello("Wang Wu"));
	}
}

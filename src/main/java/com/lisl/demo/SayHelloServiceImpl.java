package com.lisl.demo;

public class SayHelloServiceImpl implements ISayHelloService {

	public String sayHello(String name) {
		return "Hello, " + name;
	}

}

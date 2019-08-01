package com.lisl.demo.javassist;

import com.lisl.demo.SayHelloServiceImpl;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtNewConstructor;
import javassist.CtNewMethod;

public class MainJavassistDefineClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ClassPool classPool = new ClassPool(true);
		
		String superClassName = SayHelloServiceImpl.class.getName();
		CtClass ctClass = classPool.makeClass(superClassName+"Proxy");
		ctClass.setSuperclass(classPool.get(superClassName));
		ctClass.addConstructor(CtNewConstructor.defaultConstructor(ctClass));
		
		ctClass.addMethod(CtNewMethod.make("public String sayHello(String name) {return \"Addon by Javassist Define Class ==> \" + super.sayHello(name);}", ctClass));
		
		Class<SayHelloServiceImpl> proxyClass = (Class<SayHelloServiceImpl>) ctClass.toClass();
		SayHelloServiceImpl service = proxyClass.newInstance();
		
		System.out.println(service.sayHello("Eric"));
	}

}

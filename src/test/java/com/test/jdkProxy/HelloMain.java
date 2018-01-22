package com.test.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * 测试主方法
 *
 * @author mengll
 * @create 2018-01-11 14:20
 **/
public class HelloMain {
	public static void main(String[] args) {
		HelloImpl helloImpl = new HelloImpl();
		HelloProxy helloProxy = new HelloProxy(helloImpl);
		ClassLoader classLoader = helloImpl.getClass().getClassLoader();
		Class[] classes = helloImpl.getClass().getInterfaces();
		Hello hello = (Hello) Proxy.newProxyInstance(classLoader, classes, helloProxy);
		hello.sayHello();
	}
}
